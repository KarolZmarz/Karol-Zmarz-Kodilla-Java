package com.kodilla.spring;

import com.kodilla.spring.shape.Shape;

public class Square implements Shape {
    @Override
    public String getShapeName() {
        return "This is a square.";
    }
}
