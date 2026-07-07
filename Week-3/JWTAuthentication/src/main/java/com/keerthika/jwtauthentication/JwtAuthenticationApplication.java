package com.keerthika.jwtauthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtAuthenticationApplication {

    public static void main(String[] args) {

        SpringApplication.run(JwtAuthenticationApplication.class, args);

        System.out.println("======================================");
        System.out.println(" JWT Authentication Started ");
        System.out.println("======================================");
        System.out.println("Authenticate URL");
        System.out.println("http://localhost:8080/authenticate");
        System.out.println("======================================");

    }

}
