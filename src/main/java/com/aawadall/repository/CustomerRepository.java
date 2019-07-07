package com.aawadall.repository;

import java.util.List;

import com.aawadall.model.Customer;

public interface CustomerRepository {
    List<Customer> findAll();
}