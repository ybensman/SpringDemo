package com.att.course.spring.demo.components;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerMemoryConfig {
    @Bean
    RandomAccessMemoryInterface samsungRandomAccessMemory() {
        return new SamsungRandomAccessMemory(8192); // MBit
    }

    @Bean("MicronRAM")
    RandomAccessMemoryInterface micronRandomAccessMemory() {
        return new MicronRandomAccessMemory(4096); // MBit
    }
}
