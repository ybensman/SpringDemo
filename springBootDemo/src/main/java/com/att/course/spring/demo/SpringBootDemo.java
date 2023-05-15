package com.att.course.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan
//@EnableAutoConfiguration
public class SpringBootDemo {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo.class, args);
    }
}
