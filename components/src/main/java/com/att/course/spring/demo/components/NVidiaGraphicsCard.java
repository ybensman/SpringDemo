package com.att.course.spring.demo.components;

public class NVidiaGraphicsCard implements GraphicsCardInterface {

    private GraphicsProcessingUnit gpu1;

    private GraphicsProcessingUnit gpu2;

    private GraphicsCardOutputInterface graphicsCardOutputInterface;

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
