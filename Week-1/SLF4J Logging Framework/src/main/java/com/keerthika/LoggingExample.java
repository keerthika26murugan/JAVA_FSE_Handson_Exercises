package com.keerthika;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    // Create the logger instance
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        System.out.println("--- Starting Logging Application ---");
        
        // Logging messages
        logger.error("This is an error message");
        logger.warn("This is a warning message");
        logger.info("This is an info message");
        
        System.out.println("--- Logging Finished ---");
    }
}