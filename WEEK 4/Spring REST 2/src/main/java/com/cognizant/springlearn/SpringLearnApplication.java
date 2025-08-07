package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main application class for Spring Learning
 */
public class SpringLearnApplication {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
    
    /**
     * Main method to start the application
     * @param args command line arguments
     */
    public static void main(String[] args) {
        LOGGER.info("Starting Spring Learn Application");
        displayCountry();
        LOGGER.info("Spring Learn Application completed");
    }
    
    /**
     * Method to read country bean from spring configuration file and display country details
     */
    public static void displayCountry() {
        LOGGER.info("Inside displayCountry() method");
        
        // Create ApplicationContext using ClassPathXmlApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        
        // Get the country bean from the context
        Country country = (Country) context.getBean("country", Country.class);
        
        // Display the country details
        LOGGER.debug("Country : {}", country.toString());
        System.out.println("Country Details: " + country.toString());
    }
} 