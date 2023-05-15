package com.att.course.spring.demo.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Computer {
    private CentralProcessingUnit centralProcessingUnit;
    private GraphicsCard graphicsCard;
    private ComputerCooler cooler;
    private RandomAccessMemory randomAccessMemory;

    public Computer(CentralProcessingUnit centralProcessingUnit,
                    GraphicsCard graphicsCard,
                    @Qualifier("SDRAM") RandomAccessMemory randomAccessMemory,
                    ComputerCooler fan) {
        System.out.println("Computer constructor...");
        this.centralProcessingUnit = centralProcessingUnit;
        this.graphicsCard = graphicsCard;
        this.cooler = fan;
        this.randomAccessMemory = randomAccessMemory;
    }

    //@PostConstruct
    public void start() {
        System.out.println("Starting computer...");
        centralProcessingUnit.start();
        cooler.cool();
        graphicsCard.generateImage();
        randomAccessMemory.write(256); // bytes
    }
}
