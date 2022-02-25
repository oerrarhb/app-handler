package com.othmane.employeehandler.repository;

import com.othmane.employeehandler.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
