package com.example.jwtauthservice.config;

import com.example.jwtauthservice.entity.User;
import com.example.jwtauthservice.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Override
    public void run(String... args) throws Exception {
        // Create a test user if it doesn't exist
        try {
            userDetailsService.createUser("user", "pwd");
            System.out.println("Test user 'user' created successfully");
        } catch (Exception e) {
            System.out.println("Test user 'user' already exists or error occurred: " + e.getMessage());
        }
    }
} 