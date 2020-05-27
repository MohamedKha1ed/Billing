package com.store.billing.services;

import com.store.billing.entities.*;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BillServiceTester {
    UserService userService = mock(UserService.class);

    ProductService productService = mock(ProductService.class);

    private BillService billService = new BillService();

    @Mock
    private Employee employee = new Employee();

    @Mock
    private Customer customer = new Customer();

    @Mock
    private Affiliate affiliate = new Affiliate();

    @Test
    public void testEmployeeCalculation() {
        assertEquals(billService.getPayableAmount(employee, 200.0, 300.0), 410.0, 0);
    }

    @Test
    public void testAffiliateCalculation() {
        assertEquals(billService.getPayableAmount(affiliate, 200.0, 300.0), 470.0, 0);
    }

    @Test
    public void testNewCustomerCalculation() {
        customer.setCreatedAt(LocalDateTime.now());
        assertEquals(billService.getPayableAmount(customer, 200.0, 310.0), 495.0, 0);
    }

    @Test
    public void testOldCustomerCalculation() {
        customer.setCreatedAt(LocalDateTime.now().minusYears(3));
        assertEquals(billService.getPayableAmount(customer, 200.0, 310.0), 494.5, 0);
    }

}
