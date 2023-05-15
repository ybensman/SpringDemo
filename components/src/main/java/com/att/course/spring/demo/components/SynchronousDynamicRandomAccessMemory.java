package com.att.course.spring.demo.components;

public class SynchronousDynamicRandomAccessMemory implements RandomAccessMemory {
    int capacity;

    public SynchronousDynamicRandomAccessMemory(int capacity) {
        this.capacity = capacity;
    }

    public void write(int numberOfBytes) {
        System.out.println("Writing");
    }
}
