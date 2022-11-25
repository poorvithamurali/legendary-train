package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
@Service
public class CustomerService {
	@Autowired
	
	CustomerRepository customerrepository;
    public Customer adddata(Customer c) {
		
		return customerrepository.save(c);
	}
	public  List<Customer>  getcustomers() 
	{
		
		return customerrepository.findAll();
	}
	public void delete(int id) {
		customerrepository.deleteById(id);
		
	}
	public Customer update(Customer cust) {
		return customerrepository.save(cust);
		
	}
	public Optional<Customer> getcustomerById(int id) {
		
		return customerrepository.findById(id);
	}

}
