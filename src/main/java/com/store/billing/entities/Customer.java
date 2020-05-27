package com.store.billing.entities;

import javax.persistence.Entity;

@Entity
public class Customer extends User {
    public Customer() {
    }

    public Customer(Long id) {
        super(id);
    }
}
