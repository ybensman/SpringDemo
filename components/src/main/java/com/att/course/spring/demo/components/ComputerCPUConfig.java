package com.att.course.spring.demo.components;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class ComputerCPUConfig {

    @Bean
    public List<ProcessorRegister> processorRegisterList() {
        return Arrays.asList(new ProcessorRegister(ProcessorRegister.ProcessorRegisterType.NUMERIC_DATA),
                new ProcessorRegister(ProcessorRegister.ProcessorRegisterType.FLOATING_DATA),
                new ProcessorRegister(ProcessorRegister.ProcessorRegisterType.ADDRESS));
    }

    @Bean
    public ArithmeticLogicUnit arithmeticLogicUnit() {
        return new ArithmeticLogicUnit();
    }

    @Bean
    ControlUnit controlUnit() {
        return new ControlUnit();
    }

    @Bean
    IntelCentralProcessingUnit intelCentralProcessingUnit() {
        return new IntelCentralProcessingUnit(arithmeticLogicUnit(), processorRegisterList(), controlUnit());
    }

//    @Bean
//    AirCooler fan() {
//        return new AirCooler();
//    }
}
