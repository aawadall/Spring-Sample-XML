package com.aawadall.service;

import java.util.List;

import com.aawadall.model.Customer;
import com.aawadall.repository.CustomerRepository;
import com.aawadall.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}