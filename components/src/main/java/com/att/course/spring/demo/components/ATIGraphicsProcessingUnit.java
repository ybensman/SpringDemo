package com.att.course.spring.demo.components;

public class ATIGraphicsProcessingUnit implements GraphicsProcessingUnit {
    public void render() {
        System.out.println("ATI GPU: rendering....");
    }
}
