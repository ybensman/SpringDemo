package com.att.course.spring.demo.components;

public class MicronRandomAccessMemory implements RandomAccessMemoryInterface {
    int capacity;

    public MicronRandomAccessMemory(int capacity) {
        this.capacity = capacity;
    }

    public void write(int numberOfBytes) {
        System.out.println("SGRAM: Writing");
    }
}
