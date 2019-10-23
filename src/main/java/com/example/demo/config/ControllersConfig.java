package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigureradapter;

@Configuration
public class ControllersConfig extends WebMvcConfigureradapter {

    @Override

    public void addViewControllers(ViewControllerRegistry registry) {
        
        registry.addViewController("/").setViewName("device");
        registry.addViewController("/login").setViewName("login");

    }

}

