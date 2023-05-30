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

    private static void testDifferentContexts() {
        AnnotationConfigApplicationContext ctx1 =
                new AnnotationConfigApplicationContext(ComputerCPUConfig.class);
        CentralProcessingUnit centralProcessingUnit1 = ctx1.getBean(IntelCentralProcessingUnit.class);

        AnnotationConfigApplicationContext ctx2 =
                new AnnotationConfigApplicationContext(ComputerMemoryConfig.class);
        RandomAccessMemory randomAccessMemory = (RandomAccessMemory) ctx2.getBean("SDRAM");
    }

    private static Computer createComputer(ApplicationContext ctx) {

//        GraphicsProcessingUnit gpu = (GraphicsProcessingUnit) ctx.getBean("NVidiaGPU");
//        gpu.render();

        GraphicsCard graphicsCard = ctx.getBean(GraphicsCard.class);
        graphicsCard.generateImage();

        ComputerCooler airCooler = (ComputerCooler) ctx.getBean("fan");
        ComputerCooler liquidCooler = (ComputerCooler) ctx.getBean("liquid");

        CentralProcessingUnit centralProcessingUnit = ctx.getBean(IntelCentralProcessingUnit.class);

        RandomAccessMemory ram = (RandomAccessMemory) ctx.getBean("SDRAM");
    //    RandomAccessMemory ram = ctx.getBean(SynchronousDynamicRandomAccessMemory.class);

        Computer computer = new Computer(centralProcessingUnit, graphicsCard, ram, airCooler, liquidCooler);
        computer.start();

        return computer;
    }
}
