package com.aawadall.repository;

import java.util.ArrayList;
import java.util.List;

import com.aawadall.model.Customer;

/**
 * STUB
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Abbas");
        customer.setLastName("Firnas");
        customers.add(customer);
        return customers;
    }
}