package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName = "Square";
    private double sideLength;
    private double field;

    public Square(double sideLength) {
        this.sideLength = sideLength;
        this.field = sideLength * sideLength;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    public double getField() {
        return this.field;
    }
}
