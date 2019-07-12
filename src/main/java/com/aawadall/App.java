package com.aawadall;

import com.aawadall.service.CustomerService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // CustomerService service = new CustomerServiceImpl();

        // ApplicationContext appContext = new
        // ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Singleton testing, check addresses below");
        CustomerService service = appContext.getBean("customerService", CustomerService.class);
        System.out.println(service);
        CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
        System.out.println(service2);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Find First Customer");
        System.out.println(service.findAll().get(0).getFirstName());

    }
}
