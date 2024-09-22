package com.att.course.spring.demo.components;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ComputerCPUConfig {

    @Bean
    public List<ProcessorRegister> processorRegisterList() {
        return List.of(new ProcessorRegister(ProcessorRegister.ProcessorRegisterType.NUMERIC_DATA),
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

//    @Bean("IntelCPU")
//    CentralProcessingUnit intelCentralProcessingUnit() {
//        return new IntelCentralProcessingUnit(arithmeticLogicUnit(), processorRegisterList(), controlUnit());
//    }

//    @Bean("AmdCPU")
//    CentralProcessingUnit amdCentralProcessingUnit() {
//        return new AmdCentralProcessingUnit();
//    }

//    @Bean
//    ComputerCooler fan() {
//        return new AirCooler();
//    }
}
