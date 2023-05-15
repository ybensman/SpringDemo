package com.att.course.spring.demo.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ATIGPU")
public class ATIGraphicsProcessingUnit implements GraphicsProcessingUnit {
    public void render() {
        System.out.println("ATI GPU: rendering....");
    }
}
