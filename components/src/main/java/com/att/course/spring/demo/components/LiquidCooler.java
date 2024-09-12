package com.att.course.spring.demo.components;

public class LiquidCooler implements ComputerCoolerInterface {
    public void cool() {
        System.out.println("Liquid cooler: chill");
    }
}
