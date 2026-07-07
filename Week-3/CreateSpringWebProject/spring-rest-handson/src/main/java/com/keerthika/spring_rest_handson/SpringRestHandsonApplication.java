package com.keerthika.springresthandson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestHandsonApplication {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("Starting Spring REST Handson Application");
        System.out.println("main() method is executing...");
        System.out.println("========================================");

        SpringApplication.run(SpringRestHandsonApplication.class, args);

        System.out.println("========================================");
        System.out.println("Spring Boot Application Started Successfully!");
        System.out.println("========================================");
    }
}
