package com.example.config;

import com.example.web.interceptor.SimpleInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        SimpleInterceptor simpleInterceptor = new SimpleInterceptor();
        registry.addInterceptor(simpleInterceptor).addPathPatterns("/**");
    }
}
