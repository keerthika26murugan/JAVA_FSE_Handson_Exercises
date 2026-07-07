package com.keerthika.springresthandson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestHandsonApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringRestHandsonApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SpringRestHandsonApplication.class, args);

        displayCountry();
    }

    public static void displayCountry() {

    System.out.println("====================================");
    System.out.println("Exercise 26 Output");
    System.out.println("Loading Country Bean from XML...");
    System.out.println("====================================");

    ApplicationContext context =
            new ClassPathXmlApplicationContext("country.xml");

    Country country = context.getBean("country", Country.class);

    System.out.println("Country Code : " + country.getCode());
    System.out.println("Country Name : " + country.getName());

    LOGGER.debug("Country : {}", country);

    System.out.println("====================================");
}

}

