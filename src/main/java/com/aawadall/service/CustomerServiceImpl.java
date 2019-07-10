package com.aawadall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aawadall.model.Customer;
import com.aawadall.repository.CustomerRepository;

@Service("customerService") 
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
    private CustomerRepository customerRepository;

    
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }


}