package com.store.billing.entities;

import javax.persistence.Entity;

@Entity
public class Affiliate extends User {
    public Affiliate() {
    }

    public Affiliate(Long id) {
        super(id);
    }
}
