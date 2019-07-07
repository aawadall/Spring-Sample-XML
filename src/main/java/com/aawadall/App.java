package com.aawadall;

import com.aawadall.service.CustomerService;
import com.aawadall.service.CustomerServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();
        System.out.println("Find First Customer");
        System.out.println(service.findAll().get(0).getFirstName());
    }
}
