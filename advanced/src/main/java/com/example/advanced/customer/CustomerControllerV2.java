package com.example.advanced.customer;

import com.example.advanced.exception.ApiRequestException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RequestMapping(path = "/api/v2/customers")
@RestController
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    List<Customer> getCustomers(){
        return customerService.getCustomers();
    }
    @GetMapping(path = "/{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long id){
        return customerService.getCustomer(id);
    }

    @GetMapping(path = "/{customerId}/exception")
    Customer getCustomerException(@PathVariable("customerId") Long id){
        throw new ApiRequestException(
                "ApiRequestException for customer " + id
        );
    }

    @PostMapping("/")
    void createNewCustomer(@Valid @RequestBody Customer customer){
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
