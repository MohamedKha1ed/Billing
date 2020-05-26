package com.store.billing.services;

import com.store.billing.entities.Affiliate;
import com.store.billing.repositories.AffiliateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AffiliateService {
    @Autowired
    private AffiliateRepository affiliateRepository;

    public Affiliate createAffiliate(Affiliate affiliate) {
        return affiliateRepository.save(affiliate);
    }
}
