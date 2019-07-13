package com.aawadall.repository;

import java.util.ArrayList;
import java.util.List;

import com.aawadall.model.Customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * STUB
 */

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

    @Override
    public List<Customer> findAll() {
        System.out.printf("Property: dbUsername = [%s]\n", dbUsername);
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Abbas");
        customer.setLastName("Firnas");
        customers.add(customer);
        return customers;
    }
}