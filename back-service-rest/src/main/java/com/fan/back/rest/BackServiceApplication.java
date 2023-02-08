package com.fan.back.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class BackServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackServiceApplication.class, args);
    }
}
