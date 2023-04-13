package com.example.advanced.customer;

import java.util.Collections;
import java.util.List;


public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {

        return Collections.singletonList(
                new Customer(1L,"TODO. Implement real db", "todo", "email@gmail.com")
        );
    }
}
