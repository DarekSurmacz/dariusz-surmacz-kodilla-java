package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName = "Triangle";
    private double baseLenght;
    private double height;

    private double field;

    public Triangle(double baseLenght, double height) {
        this.baseLenght = baseLenght;
        this.height = height;
        this.field = baseLenght * height / 2;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return this.field;
    }
}
