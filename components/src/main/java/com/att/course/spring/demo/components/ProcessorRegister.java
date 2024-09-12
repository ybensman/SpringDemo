package com.att.course.spring.demo.components;

public class ProcessorRegister {
    public enum ProcessorRegisterType {
        NUMERIC_DATA,
        FLOATING_DATA,
        ADDRESS
    }

    private ProcessorRegisterType processorRegisterType;

    ProcessorRegister(ProcessorRegisterType processorRegisterType) {
        this.processorRegisterType = processorRegisterType;
    }
}
