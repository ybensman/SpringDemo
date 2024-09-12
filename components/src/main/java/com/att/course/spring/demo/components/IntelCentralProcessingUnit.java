package com.att.course.spring.demo.components;

import java.util.List;

public class IntelCentralProcessingUnit implements CentralProcessingUnitInterface {
    private ArithmeticLogicUnit alu;
    private List<ProcessorRegister> registersList;
    private ControlUnit cu;

    public IntelCentralProcessingUnit(ArithmeticLogicUnit alu, List<ProcessorRegister> registersList, ControlUnit cu) {
        this.alu = alu;
        this.registersList = registersList;
        this.cu = cu;

        System.out.println("IntelCentralProcessingUnit constructor");
    }

    public void start() {
        System.out.println("Starting Intel CPU...");
        System.out.print("Calculating 2 + 3:" );
        System.out.println(alu.summarize(2, 3));

    }
}
