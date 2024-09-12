package com.att.course.spring.demo.components;

public class DeltaPowerSupplyUnit implements PowerSupplyUnitInterface {
    DeltaPowerSupplyUnit() {
        System.out.println("Delta power supply unit constructor..");
    }

    public void turnOn() {
        System.out.println("Turning on the Delta power supply unit...");
    }
}
