package com.example.advanced.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RequestMapping(path = "/api/v2/customer")
@RestController
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/all")
    List<Customer> getCustomer(){
        return Collections.singletonList(
                new Customer(0L,"v2 john","v2pass")
        );
    }
    @PostMapping("/")
    void createNewCustomer(@RequestBody Customer customer){
        System.out.println("Post Request for ");
        System.out.println(customer);
    }

    @DeleteMapping(path = "{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("Delete Request for customer with ID " + id);
    }

    @PutMapping("/")
    void updateNewCustomer(@RequestBody Customer customer){
        System.out.println("Update Request for ");
        System.out.println(customer);
    }

}
