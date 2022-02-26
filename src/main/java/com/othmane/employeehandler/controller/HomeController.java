package com.othmane.employeehandler.controller;

import com.othmane.employeehandler.model.Employee;
import com.othmane.employeehandler.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/employees")
public class HomeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    private List<Employee> getEmployee() {
        return (List<Employee>) this.employeeRepository.findAll();
    }

    @DeleteMapping("/{id}")
    private ResponseEntity deleteEmployee(@PathVariable Long id) {
        this.employeeRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }


}
