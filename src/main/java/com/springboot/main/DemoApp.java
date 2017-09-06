package com.springboot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.springboot")
@EnableAutoConfiguration
public class DemoApp {
    
    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class, args);
    }

}
