package com.store.billing.controllers;

import com.store.billing.entities.Affiliate;
import com.store.billing.entities.Product;
import com.store.billing.entities.User;
import com.store.billing.services.AffiliateService;
import com.store.billing.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product newProduct){
        return productService.createProduct(newProduct);
    }
}
