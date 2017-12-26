package com.liu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ThymeleafApplication {
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ThymeleafApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafApplication.class, args);
    }
}
