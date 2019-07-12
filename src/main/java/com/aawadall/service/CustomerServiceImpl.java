package com.aawadall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aawadall.model.Customer;
import com.aawadall.repository.CustomerRepository;

<<<<<<< HEAD
@Service("customerService") 
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
    private CustomerRepository customerRepository;

    
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    //@Autowired
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        System.out.println("Constructor injection invoked");
    }
>>>>>>> e662d4ebfa0ac3b41eb93231a131fb0e5caf843b
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

<<<<<<< HEAD
=======
    /**
     * @param customerRepository the customerRepository to set
     */
    //@Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        System.out.println("Setter injection invoked!");
    }
>>>>>>> e662d4ebfa0ac3b41eb93231a131fb0e5caf843b

}