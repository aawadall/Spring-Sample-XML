
package com.aawadall;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({ "com.aawadall" })
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcePlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    // @Bean(name = "customerService")
    // public CustomerService getCustomerService() {
    // //CustomerServiceImpl service = new
    // CustomerServiceImpl(getCustomerRepository());
    // CustomerServiceImpl service = new CustomerServiceImpl();
    // //service.setCustomerRepository(getCustomerRepository());
    // System.out.println("AppConfig::getCustomerConfig");
    // return service;
    // }

    // @Bean(name = "customerRepository")
    // public CustomerRepository getCustomerRepository() {
    // System.out.println("ApConfig::getCustomerRepository");
    // return new HibernateCustomerRepositoryImpl();
    // }
}