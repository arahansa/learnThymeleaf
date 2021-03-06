package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by arahansa on 2015-03-15.
 */
@SpringBootApplication
@ComponentScan("controller")
public class LearnThmeleafApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(LearnThmeleafApplication.class, args);
    }
}
