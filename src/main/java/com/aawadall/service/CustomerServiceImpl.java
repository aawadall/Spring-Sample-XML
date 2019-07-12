package com.aawadall.service;

import java.util.List;

import com.aawadall.model.Customer;
import com.aawadall.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    // @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        System.out.println("Constructor injection invoked");
    }

    public CustomerServiceImpl() {
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    /**
     * @param customerRepository the customerRepository to set
     */
    // @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        System.out.println("Setter injection invoked!");
    }

}