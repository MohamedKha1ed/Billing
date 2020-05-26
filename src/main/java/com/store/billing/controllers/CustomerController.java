package com.store.billing.controllers;

import com.store.billing.controllers.services.CustomerService;
import com.store.billing.entities.Customer;
import com.store.billing.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customers")
    public User createUser(@RequestBody Customer newCustomer){
        return customerService.createCustomer(newCustomer);
    }
}
