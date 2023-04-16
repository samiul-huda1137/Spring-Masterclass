package com.example.advanced.customer;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo {
    List<Customer> getCustomers();
}
