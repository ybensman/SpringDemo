package com.att.course.spring.demo.components;

import org.springframework.stereotype.Component;

@Component
public class VGAOutputInterface implements GraphicsCardOutputInterface {
    public void outputVideo() {
        System.out.println("VGA Output Video");
    }
}
