package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SpringbootWebExample2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebExample2Application.class, args);
    }

}
