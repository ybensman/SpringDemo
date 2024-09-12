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

//        testDifferentContexts();
//        createComputer(ctx);
    }

/*
    private static void testDifferentContexts() {
        AnnotationConfigApplicationContext ctx1 =
                new AnnotationConfigApplicationContext(ComputerCPUConfig.class);
        CentralProcessingUnitInterface centralProcessingUnit1 = ctx1.getBean(IntelCentralProcessingUnit.class);

        AnnotationConfigApplicationContext ctx2 =
                new AnnotationConfigApplicationContext(ComputerMemoryConfig.class);
        RandomAccessMemoryInterface randomAccessMemory = (RandomAccessMemoryInterface) ctx2.getBean("SamsungSDRAM");
    }
*/
    private static Computer createComputer(ApplicationContext ctx) {

        GraphicsProcessingUnit gpu = (GraphicsProcessingUnit) ctx.getBean("NVidiaGPU");
        gpu.render();

        PowerSupplyUnitInterface psu = ctx.getBean(PowerSupplyUnitInterface.class);

        GraphicsCardInterface graphicsCard = ctx.getBean(GraphicsCardInterface.class);
        graphicsCard.generateImage();

        ComputerCoolerInterface airCooler = (ComputerCoolerInterface) ctx.getBean("fan");
        ComputerCoolerInterface liquidCooler = (ComputerCoolerInterface) ctx.getBean("liquid");

        CentralProcessingUnitInterface centralProcessingUnit = ctx.getBean(IntelCentralProcessingUnit.class);

        RandomAccessMemoryInterface ram = (RandomAccessMemoryInterface) ctx.getBean("SamsungSDRAM");
    //    RandomAccessMemoryInterface ram = ctx.getBean(SamsungRandomAccessMemory.class);

        Computer computer = new Computer(psu, centralProcessingUnit, graphicsCard, ram, airCooler, liquidCooler);
        computer.start();

        return computer;
    }
}
