package com.stark.patterns.structural.bridge;

public class Square extends Shape{

    public Square(Color color) {
        super(color);
    }

    public void applyColor() {
        color.applyColor();
    }
}
