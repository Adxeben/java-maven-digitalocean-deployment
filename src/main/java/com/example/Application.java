package com.example;

// Spring Boot core imports

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Logging framework (SLF4J)
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Runs method after application startup
import javax.annotation.PostConstruct;

/**
 * Main entry point of the Spring Boot application.
 * This class bootstraps and starts the application context.
 */

@SpringBootApplication
public class Application {

    /**
     * Main method - starts the Spring Boot application.
     * This triggers auto-configuration and component scanning.
     */
    
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void init()
    {
        Logger log = LoggerFactory.getLogger(Application.class);
        log.info("Java app started");
    }

    public String getStatus() {
        return "OK";
    }
}
