package com.store.billing.services;

import com.store.billing.entities.Product;
import com.store.billing.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getProducts(List<Long> ids) {
        return productRepository.findAllById(ids);
    }
}
