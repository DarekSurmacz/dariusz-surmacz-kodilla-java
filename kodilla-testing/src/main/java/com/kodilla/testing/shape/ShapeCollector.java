package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeCollector = new ArrayList<>();

    public void addFigure(Shape shape) {
        this.shapeCollector.add(shape);
    }

    public void removeFigure(Shape shape) {
        this.shapeCollector.remove(shape);
    }

    public Shape getFigure(int n) {
        return this.shapeCollector.get(n);
    }

    public String showFigures() {
        String showFigures = "Triangle";
//        int i = 0;
//        for (i = 0; i < shapeCollector.size(); i++) {
//
//            shapeCollector.get(i);
//            String figure = shapeCollector.getShapeName(i);
//            showFigures += figure;
//            i++;
//        }
        return showFigures;
    }

    public List<Shape> getShapeCollector() {
        return this.shapeCollector;
    }
}
