package com.store.billing.services;

import com.store.billing.entities.*;
import com.store.billing.repositories.BillRepository;
import com.store.billing.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BillService {
    @Autowired
    private BillRepository billRepository;

    @Autowired
    private ProductService productService;

    @Autowired
    private UserService userService;

    public double createBill(Bill bill) {
        bill.setPayableAmount(calculatePayableAmount(bill));
        billRepository.save(bill);
        return bill.getPayableAmount();
    }

    public double calculatePayableAmount(Bill bill) {
        double amount = 1.0;
        User billUser = userService.getUser(bill.getUser().getId());
        List<Long> productIds = bill.getProducts().stream().map(product -> product.getId()).collect(Collectors.toList());
        List<Product> billProducts = productService.getProducts(productIds);
        double GroceriesAmount = billProducts.stream().filter(product -> product.getCategory().equals(Category.GROCERIES)).mapToDouble(Product::getPrice).sum();
        double otherAmount = billProducts.stream().filter(product -> product.getCategory().equals(Category.OTHER)).mapToDouble(Product::getPrice).sum();
        return getPayableAmount(billUser, GroceriesAmount, otherAmount);
    }

    public double getPayableAmount(User billUser, double GroceriesAmount, double otherAmount) {
        if (billUser instanceof Employee) {
            return GroceriesAmount + ((70 * otherAmount) / 100);
        } else if (billUser instanceof Affiliate) {
            return GroceriesAmount + ((90 * otherAmount) / 100);
        } else if (billUser.getCreatedAt().isBefore(LocalDateTime.now().minusYears(2))){
            return GroceriesAmount + ((95 * otherAmount) / 100);
        } else {
            return GroceriesAmount + (otherAmount % 100) + ((95 * (otherAmount-(otherAmount%100))) / 100);
        }
    }
}
