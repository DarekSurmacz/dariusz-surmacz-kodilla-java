package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName = "Circle";
    private double radius;
    private double field;

    public Circle(double radius) {
        this.radius = radius;
        this.field = 3.14 * radius * radius;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return this.field;
    }
}
