package com.att.course.spring.demo.components;

public class NVidiaGraphicsProcessingUnit implements GraphicsProcessingUnit {
    public void render() {
        System.out.println("NVidia GPU: rendering....");
    }
}
