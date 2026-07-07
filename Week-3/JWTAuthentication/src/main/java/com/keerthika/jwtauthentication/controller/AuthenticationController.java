package com.keerthika.jwtauthentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keerthika.jwtauthentication.service.JwtUserDetailsService;
import com.keerthika.jwtauthentication.util.JwtUtil;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public String authenticate() {

        UserDetails userDetails =
                userDetailsService.loadUserByUsername("keerthika");

        String token = jwtUtil.generateToken(userDetails);

        return "JWT Token Generated Successfully\n\n" + token;
    }
}
