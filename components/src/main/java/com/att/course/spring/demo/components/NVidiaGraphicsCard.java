package com.att.course.spring.demo.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NVidiaGraphicsCard implements GraphicsCard {

    @Autowired
    @Qualifier("NVidiaGPU")
    private GraphicsProcessingUnit gpu1;

    @Autowired
    @Qualifier("ATIGPU")
    private GraphicsProcessingUnit gpu2;

    private GraphicsCardOutputInterface graphicsCardOutputInterface;

    @Autowired
    void setGraphicsCardOutputInterface(GraphicsCardOutputInterface graphicsCardOutputInterface) {
        this.graphicsCardOutputInterface = graphicsCardOutputInterface;
    }

    public void generateImage() {
        System.out.println("Generating image...");
        gpu1.render();
        gpu2.render();
        graphicsCardOutputInterface.outputVideo();
    }
}
