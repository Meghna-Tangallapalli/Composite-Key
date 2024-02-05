package com.composite;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.composite.Entity.CustomerEntity;
import com.composite.Repository.CustomerRepository;

@SpringBootApplication
@RestController
@RequestMapping("/customer")
public class CompositeKeyApplication {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(CompositeKeyApplication.class, args);
	}

	@PostMapping("/save")
	public CustomerEntity save(@RequestBody CustomerEntity customer) {
		return customerRepository.save(customer);

	}

	@GetMapping("/getAll")
	public List<CustomerEntity> getAll() {
		return customerRepository.findAll();

	}

	@GetMapping("/byName")
	public CustomerEntity findByName(CustomerEntity customer) {
	CustomerEntity findByName =	customerRepository.findByName(customer.getName());
      		return customer;
		
	}
	
}
