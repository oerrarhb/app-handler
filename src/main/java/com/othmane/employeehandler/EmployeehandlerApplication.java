package com.othmane.employeehandler;

import com.othmane.employeehandler.model.Employee;
import com.othmane.employeehandler.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeehandlerApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(EmployeehandlerApplication.class, args);
    }


    private final EmployeeRepository repository;

    @Autowired
    public EmployeehandlerApplication(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
        this.repository.save(new Employee("Daryl", "Dixon", "Archer"));
        this.repository.save(new Employee("Jhon", "Whick", "Agent"));

    }
}
