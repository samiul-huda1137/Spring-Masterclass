package com.example.advanced.customer;

import com.example.advanced.infoapp.InfoApp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

    @Value("${app.useFakeCustomerRepo:false}")
    private Boolean useFakeCustomerRepo;

    @Bean
    CommandLineRunner commandLineRunner(InfoApp infoApp){
        return  args ->{
            System.out.println("Command line runner check!!");
            System.out.println(infoApp);
        };
    }

    @Bean
    CustomerRepo customerRepo(){
        System.out.println("useFakeCustomerRepo =" + useFakeCustomerRepo);
        return new CustomerFakeRepo();

    }
}
