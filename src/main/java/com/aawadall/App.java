package com.aawadall;

import com.aawadall.service.CustomerService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // CustomerService service = new CustomerServiceImpl();

        ApplicationContext appContext = new ClassPathXmlApplicationContext("resources/applicationConext.xml");
        CustomerService service = appContext.getBean("customerService", CustomerService.class);
        System.out.println("Find First Customer");
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
