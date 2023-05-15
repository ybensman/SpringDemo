package com.att.course.spring.demo.components;

import org.springframework.stereotype.Component;

@Component
public class LiquidCooler implements ComputerCooler {
    public void cool() {
        System.out.println("Liquid cooler");
    }
}
