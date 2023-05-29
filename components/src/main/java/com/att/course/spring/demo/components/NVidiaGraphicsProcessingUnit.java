package com.att.course.spring.demo.components;

import org.springframework.stereotype.Component;

@Component("NVidiaGPU")
public class NVidiaGraphicsProcessingUnit implements GraphicsProcessingUnit {
    public void render() {
        System.out.println("NVidia GPU: rendering....");
    }
}
