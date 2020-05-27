package com.store.billing.entities;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product extends AbstractEntity {
    @Column(name = "name")
    private String name;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "category")
    private Category category = Category.OTHER;

    @Column(name = "price")
    private Double price;

    public Product() {
    }

    public Product(Long id, String name, Category category, Double price) {
        super(id);
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
