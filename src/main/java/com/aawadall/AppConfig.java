
package com.aawadall;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.aawadall"})
public class AppConfig {

    // @Bean(name = "customerService")
    // public CustomerService getCustomerService() {
    //     //CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
    //     CustomerServiceImpl service = new CustomerServiceImpl();
    //     //service.setCustomerRepository(getCustomerRepository());
    //     System.out.println("AppConfig::getCustomerConfig");
    //     return service;
    // }

    // @Bean(name = "customerRepository")
    // public CustomerRepository getCustomerRepository() {
    //     System.out.println("ApConfig::getCustomerRepository");
    //     return new HibernateCustomerRepositoryImpl();
    // }
}