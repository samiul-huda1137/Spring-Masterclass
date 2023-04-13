package com.example.advanced.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/api/v1/customer")
@RestController
@Deprecated
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/all")
    List<Customer> getCustomer(){
        return customerService.getCustomers();
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
