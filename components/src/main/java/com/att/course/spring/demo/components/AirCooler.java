package com.att.course.spring.demo.components;

public class AirCooler implements ComputerCoolerInterface {
    public void cool() {
        System.out.println("AirCooler: Blowing");
    }
}
