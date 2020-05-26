package com.store.billing.controllers;

import com.store.billing.entities.Bill;
import com.store.billing.entities.Product;
import com.store.billing.services.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillController {

    @Autowired
    private BillService billService;

    @PostMapping("/bills")
    public Double createBill(@RequestBody Bill newBill){
        return billService.createBill(newBill);
    }
}
