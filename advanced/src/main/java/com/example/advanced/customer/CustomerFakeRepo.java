package com.example.advanced.customer;

import java.util.Arrays;
import java.util.List;


public class CustomerFakeRepo implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L,"John Doe", "password123"),
                new Customer(2L,"Jane Doe", "password789")

        );
    }
}
