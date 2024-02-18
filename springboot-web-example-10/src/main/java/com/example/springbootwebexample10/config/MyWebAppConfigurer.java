package com.example.springbootwebexample10.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/xxx/**").addResourceLocations("classpath:/xxx/");
        registry.addResourceHandler("/yyy/**").addResourceLocations("classpath:/yyy/");
        registry.addResourceHandler("/zzz/**").addResourceLocations("classpath:/zzz/");
    }
}
