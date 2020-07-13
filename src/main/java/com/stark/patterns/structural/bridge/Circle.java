package com.stark.patterns.structural.bridge;

public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    public void applyColor() {
        color.applyColor();
    }
}
