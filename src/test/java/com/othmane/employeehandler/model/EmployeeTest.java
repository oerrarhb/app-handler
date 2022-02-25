package com.othmane.employeehandler.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTest {

    @Test
    public void test_employee_equality() {
        var employee1 = new Employee();
        employee1.setId(1L);
        employee1.setFirstName("Jhon");
        employee1.setLastName("Wick");
        employee1.setDescription("Agent");

        var employee2 = new Employee();
        employee2.setId(1L);
        employee2.setFirstName("Jhon");
        employee2.setLastName("Wick");
        employee2.setDescription("Agent");

        assertThat(employee1).isEqualTo(employee2);
    }

    @Test
    public void test_employee_non_equality() {
        var employee1 = new Employee();
        employee1.setId(1L);
        employee1.setFirstName("Jhon");
        employee1.setLastName("Wick");
        employee1.setDescription("Agent");

        var employee2 = new Employee();
        employee2.setId(2L);
        employee2.setFirstName("Jhon");
        employee2.setLastName("Wick");
        employee2.setDescription("Agent");

        assertThat(employee1).isNotEqualTo(employee2);
    }
}
