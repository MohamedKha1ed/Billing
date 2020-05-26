package com.store.billing.repositories;

import com.store.billing.entities.Affiliate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AffiliateRepository extends JpaRepository<Affiliate, Long> {
}
