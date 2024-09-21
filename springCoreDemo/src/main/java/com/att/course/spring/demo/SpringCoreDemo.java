package com.att.course.spring.demo;

import com.att.course.spring.demo.components.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringCoreDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext("com.att.course.spring.demo.components");

        Computer computer = ctx.getBean(Computer.class);
        computer.start();

        testDifferentContexts();
//        createComputer(ctx);
    }

    private static void testDifferentContexts() {
        AnnotationConfigApplicationContext ctx1 =
                new AnnotationConfigApplicationContext(ComputerCPUConfig.class);
        CentralProcessingUnitInterface centralProcessingUnit1 = ctx1.getBean(IntelCentralProcessingUnit.class);
        CentralProcessingUnitInterface centralProcessingUnit2 = (CentralProcessingUnitInterface)
                ctx1.getBean("intelCentralProcessingUnit");

        AnnotationConfigApplicationContext ctx2 =
                new AnnotationConfigApplicationContext(ComputerMemoryConfig.class);
        RandomAccessMemoryInterface micronRAM = (RandomAccessMemoryInterface) ctx2.getBean("MicronRAM");
        RandomAccessMemoryInterface samsungRAM = (RandomAccessMemoryInterface) ctx2.getBean("samsungRandomAccessMemory");
    }

    private static Computer createComputer(ApplicationContext ctx) {

        GraphicsProcessingUnit gpu = (GraphicsProcessingUnit) ctx.getBean("NVidiaGPU");
        gpu.render();

        PowerSupplyUnitInterface psu = ctx.getBean(PowerSupplyUnitInterface.class);
        PowerSupplyUnitInterface deltaPowerSupplyUnit = (PowerSupplyUnitInterface) ctx.getBean("deltaPowerSupplyUnit");

        GraphicsCardInterface graphicsCard = ctx.getBean(GraphicsCardInterface.class);
        graphicsCard.generateImage();

        ComputerCoolerInterface airCooler = (ComputerCoolerInterface) ctx.getBean("fan");
        ComputerCoolerInterface liquidCooler = (ComputerCoolerInterface) ctx.getBean("liquid");

        CentralProcessingUnitInterface centralProcessingUnit = ctx.getBean(IntelCentralProcessingUnit.class);

        RandomAccessMemoryInterface samsungRAM = (RandomAccessMemoryInterface) ctx.getBean("samsungRandomAccessMemory");
        RandomAccessMemoryInterface micronRAM = (RandomAccessMemoryInterface) ctx.getBean("MicronRAM");
        RandomAccessMemoryInterface anotherSamsungRAM = ctx.getBean(SamsungRandomAccessMemory.class);

        Computer computer = new Computer(psu, centralProcessingUnit, graphicsCard, samsungRAM, airCooler, liquidCooler);
        computer.start();

        return computer;
    }
}
