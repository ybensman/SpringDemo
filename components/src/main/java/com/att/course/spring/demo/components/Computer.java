package com.att.course.spring.demo.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Computer {
    private final PowerSupplyUnitInterface psu;
    private final CentralProcessingUnitInterface centralProcessingUnit;
    private final GraphicsCardInterface graphicsCard;
    private final RandomAccessMemoryInterface randomAccessMemory;
    private final ComputerCoolerInterface cooler1;
    private final ComputerCoolerInterface cooler2;

    public Computer(PowerSupplyUnitInterface psu,
                    CentralProcessingUnitInterface centralProcessingUnitInterface,
                    GraphicsCardInterface graphicsCardInterface,
                    @Qualifier("samsungRandomAccessMemory") RandomAccessMemoryInterface randomAccessMemory,
                    ComputerCoolerInterface fan,
                    ComputerCoolerInterface liquid) {
        System.out.println("Computer constructor...");
        this.psu = psu;
        this.centralProcessingUnit = centralProcessingUnitInterface;
        this.graphicsCard = graphicsCardInterface;
        this.cooler1 = fan;
        this.cooler2 = liquid;
        this.randomAccessMemory = randomAccessMemory;
    }

    @PostConstruct
    public void start() {
        System.out.println("Starting computer...");
        psu.turnOn();
        centralProcessingUnit.start();
        cooler1.cool();
        cooler2.cool();
        graphicsCard.generateImage();
        randomAccessMemory.write(256); // bytes
    }
}
