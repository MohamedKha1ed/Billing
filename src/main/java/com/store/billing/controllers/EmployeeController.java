package com.store.billing.controllers;

import com.store.billing.services.EmployeeService;
import com.store.billing.entities.Employee;
import com.store.billing.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public User createUser(@RequestBody Employee newEmployee){
        return employeeService.createEmployee(newEmployee);
    }
}
