package com.example.advanced.customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerService {
    Customer getCustomer(){
        return new Customer(1L,"John Doe");
    }
}
