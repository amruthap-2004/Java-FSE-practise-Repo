package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller for Hello World service
 * Provides endpoints for basic greeting functionality
 */
@RestController
public class HelloController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
    
    /**
     * Returns a simple "Hello World!!" message
     * 
     * @return "Hello World!!" string
     */
    @GetMapping("/hello")
    public String sayHello() {
        LOGGER.info("START - sayHello() method");
        
        String message = "Hello World!!";
        
        LOGGER.info("END - sayHello() method");
        return message;
    }
} 