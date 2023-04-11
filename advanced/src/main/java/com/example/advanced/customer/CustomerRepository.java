package com.example.advanced.customer;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Collections.emptyList();
    }
}
