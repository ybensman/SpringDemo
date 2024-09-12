package com.att.course.spring.demo.components;

import org.springframework.stereotype.Component;

@Component("liquid")
public class LiquidCooler implements ComputerCoolerInterface {
    public void cool() {
        System.out.println("Liquid cooler: chill");
    }
}
