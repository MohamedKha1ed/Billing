package com.store.billing.repositories;

import com.store.billing.entities.Affiliate;
import com.store.billing.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
