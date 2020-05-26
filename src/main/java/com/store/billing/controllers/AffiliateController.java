package com.store.billing.controllers;

import com.store.billing.services.AffiliateService;
import com.store.billing.entities.Affiliate;
import com.store.billing.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AffiliateController {

    @Autowired
    private AffiliateService affiliateService;

    @PostMapping("/affiliates")
    public User createUser(@RequestBody Affiliate newAffiliate){
        return affiliateService.createAffiliate(newAffiliate);
    }
}
