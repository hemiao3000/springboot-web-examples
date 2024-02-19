package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ResourceProperties;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;

@SpringBootApplication
public class SpringbootWebExample0Application {

    public static void main(String[] args) {
        WebMvcAutoConfiguration configuration;
        WebMvcProperties p1;
        ResourceProperties p2;

        SpringApplication.run(SpringbootWebExample0Application.class, args);
    }

}
