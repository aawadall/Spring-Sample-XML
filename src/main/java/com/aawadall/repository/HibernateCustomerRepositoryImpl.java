package com.aawadall.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.aawadall.model.Customer;

import org.springframework.stereotype.Repository;

/**
 * STUB
 */
<<<<<<< HEAD

=======
>>>>>>> e662d4ebfa0ac3b41eb93231a131fb0e5caf843b
@Repository("customerRepository")
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