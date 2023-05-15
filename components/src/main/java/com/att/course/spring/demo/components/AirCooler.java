package com.att.course.spring.demo.components;

import org.springframework.stereotype.Component;

@Component("fan")
public class AirCooler implements ComputerCooler {
    public void cool() {
        System.out.println("AirCooler: Blowing");
    }
}
