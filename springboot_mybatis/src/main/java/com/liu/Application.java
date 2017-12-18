package com.liu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling //此为定时任务注解
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
