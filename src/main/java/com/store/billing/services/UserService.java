package com.store.billing.services;

import com.store.billing.entities.Affiliate;
import com.store.billing.entities.User;
import com.store.billing.repositories.AffiliateRepository;
import com.store.billing.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow();
    }
}
