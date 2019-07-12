
package com.aawadall;

import com.aawadall.repository.CustomerRepository;
import com.aawadall.repository.HibernateCustomerRepositoryImpl;
import com.aawadall.service.CustomerService;
import com.aawadall.service.CustomerServiceImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.aawadall"})
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService() {
        CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
        System.out.println("AppConfig::getCustomerConfig");
        return service;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        System.out.println("ApConfig::getCustomerRepository");
        return new HibernateCustomerRepositoryImpl();
    }
}