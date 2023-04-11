package com.example.advanced;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AdvancedApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvancedApplication.class, args);
	}

	@GetMapping("/")
	Customer getCustomer(){
		return new Customer(1L,"John Doe");
	}

	class Customer {
		private final Long id;
		private final String name;

		public Long getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		Customer(Long id, String name) {
			this.id = id;
			this.name = name;
		}
	}

}
