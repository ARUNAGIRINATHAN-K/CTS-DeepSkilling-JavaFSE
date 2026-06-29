package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class MainApp {
    public static void main(String[] args) {
        // Load the Spring context from the configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the customized BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Test the configuration and injection by invoking service method
        bookService.manageBooks();
    }
}
