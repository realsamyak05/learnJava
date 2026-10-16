package com.kiet.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication 
public class StudentApplication implements CommandLineRunner{
    private static final Logger logger = LoggerFactory.getLogger(StudentApplication.class);

    public static void main(String [] args){
        SpringApplication.run(StudentApplication.class, args);
    }

    @Override 
    public void run(String... args){
        logger.info("KIET Student management system started");
        logger.info("Loading Student Data");
        logger.info("Student Management API is ready...");
    }
}