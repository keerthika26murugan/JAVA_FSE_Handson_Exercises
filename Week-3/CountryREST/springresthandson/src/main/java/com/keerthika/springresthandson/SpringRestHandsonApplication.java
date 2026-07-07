package com.keerthika.springresthandson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringRestHandsonApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringRestHandsonApplication.class);
    
    
    public static void main(String[] args) {

        SpringApplication.run(SpringRestHandsonApplication.class, args);

        System.out.println();
        System.out.println("==============================================");
        System.out.println(" Spring Boot Application Started Successfully ");
        System.out.println("==============================================");
        System.out.println("Exercise 28 URL : http://localhost:8080/country");
        System.out.println("==============================================");
        System.out.println();

        displayCountry();
    }

    public static void displayCountry() {

        System.out.println("Loading Country Bean from XML...");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country = context.getBean("country", Country.class);

        System.out.println("Country Code : " + country.getCode());
        System.out.println("Country Name : " + country.getName());

        LOGGER.debug("Country : {}", country);
    }
}
