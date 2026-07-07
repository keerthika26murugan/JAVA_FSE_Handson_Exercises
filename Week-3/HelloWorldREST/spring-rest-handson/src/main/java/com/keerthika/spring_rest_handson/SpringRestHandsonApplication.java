package com.keerthika.springresthandson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestHandsonApplication {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("Starting Spring REST Handson Application");
        System.out.println("========================================");

        SpringApplication.run(SpringRestHandsonApplication.class, args);

        System.out.println("========================================");
        System.out.println("Application Started Successfully");
        System.out.println("Open Browser: http://localhost:8080/hello");
        System.out.println("========================================");
    }
}
