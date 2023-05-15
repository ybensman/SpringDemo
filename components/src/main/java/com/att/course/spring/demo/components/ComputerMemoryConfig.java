package com.att.course.spring.demo.components;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerMemoryConfig {
    @Bean("SDRAM")
    SynchronousDynamicRandomAccessMemory synchronousDynamicRandomAccessMemory() {
        return new SynchronousDynamicRandomAccessMemory(8192); // MBit
    }

    @Bean("SGRAM")
    SynchronousGraphicsRandomAccessMemory synchronousGraphicsRandomAccessMemory() {
        return new SynchronousGraphicsRandomAccessMemory(4096); // MBit
    }
}
