package com.othmane.employeehandler.controller;

import com.othmane.employeehandler.model.Employee;
import com.othmane.employeehandler.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
