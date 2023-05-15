package com.att.course.spring.demo.components;

public class SynchronousGraphicsRandomAccessMemory implements RandomAccessMemory {
    int capacity;

    public SynchronousGraphicsRandomAccessMemory(int capacity) {
        this.capacity = capacity;
    }

    public void write(int numberOfBytes) {
        System.out.println("Writing");
    }
}
