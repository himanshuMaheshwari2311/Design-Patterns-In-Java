package com.stark.patterns.structural.bridge;

public class Main {
    public static void main(String args[]) {
        Color blue = new Blue();
        Shape square = new Square(blue);
        Color red = new Red();
        Shape circle = new Circle(red);

        square.applyColor();
        circle.applyColor();
    }
}
