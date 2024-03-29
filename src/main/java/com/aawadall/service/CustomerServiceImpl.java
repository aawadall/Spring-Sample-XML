package com.aawadall.service;

import java.util.List;

import com.aawadall.model.Customer;
import com.aawadall.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        System.out.println("CustomerServiceImpl Constructor injection invoked");
    }

    public CustomerServiceImpl() {
        System.out.println("CustomerServiceImpl default no args constructor invoked");
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    /**
     * @param customerRepository the customerRepository to set
     */
    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        System.out.println("CustomerServiceImpl::setCustomerRepository Setter injection invoked!");
    }

}