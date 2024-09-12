package com.att.course.spring.demo.components;

import org.springframework.stereotype.Component;

@Component
public class DeltaPowerSupplyUnit implements PowerSupplyUnitInterface {
    DeltaPowerSupplyUnit() {
        System.out.println("Delta power supply unit constructor..");
    }

    public void turnOn() {
        System.out.println("Turning on the Delta power supply unit...");
    }
}
