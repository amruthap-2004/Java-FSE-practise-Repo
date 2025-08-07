package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Country class to represent country information
 */
public class Country {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
    
    private String code;
    private String name;
    
    /**
     * Empty parameter constructor with debug log
     */
    public Country() {
        LOGGER.debug("Inside Country Constructor.");
    }
    
    /**
     * Getter for country code
     * @return the country code
     */
    public String getCode() {
        LOGGER.debug("Inside getCode() method");
        return code;
    }
    
    /**
     * Setter for country code
     * @param code the country code to set
     */
    public void setCode(String code) {
        LOGGER.debug("Inside setCode() method");
        this.code = code;
    }
    
    /**
     * Getter for country name
     * @return the country name
     */
    public String getName() {
        LOGGER.debug("Inside getName() method");
        return name;
    }
    
    /**
     * Setter for country name
     * @param name the country name to set
     */
    public void setName(String name) {
        LOGGER.debug("Inside setName() method");
        this.name = name;
    }
    
    /**
     * toString method to display country details
     * @return string representation of the country
     */
    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
} 