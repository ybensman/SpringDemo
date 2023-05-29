package com.att.course.spring.demo.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Computer {
    private final CentralProcessingUnit centralProcessingUnit;
    private final GraphicsCard graphicsCard;
    private final ComputerCooler cooler1;
    private final ComputerCooler cooler2;

    private final RandomAccessMemory randomAccessMemory;

    public Computer(CentralProcessingUnit centralProcessingUnit,
                    GraphicsCard graphicsCard,
                    @Qualifier("SDRAM") RandomAccessMemory randomAccessMemory,
                    ComputerCooler fan,
                    ComputerCooler liquid) {
        System.out.println("Computer constructor...");
        this.centralProcessingUnit = centralProcessingUnit;
        this.graphicsCard = graphicsCard;
        this.cooler1 = fan;
        this.cooler2 = liquid;
        this.randomAccessMemory = randomAccessMemory;
    }

    //@PostConstruct
    public void start() {
        System.out.println("Starting computer...");
        centralProcessingUnit.start();
        cooler1.cool();
        cooler2.cool();
        graphicsCard.generateImage();
        randomAccessMemory.write(256); // bytes
    }
}
