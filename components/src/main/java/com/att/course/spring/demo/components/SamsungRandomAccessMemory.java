package com.att.course.spring.demo.components;

public class SamsungRandomAccessMemory implements RandomAccessMemoryInterface {
    int capacity;

    public SamsungRandomAccessMemory(int capacity) {
        this.capacity = capacity;
    }

    public void write(int numberOfBytes) {
        System.out.println("Samsung RAM: Writing");
    }
}
