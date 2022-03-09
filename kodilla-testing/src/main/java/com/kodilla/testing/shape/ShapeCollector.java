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
        String showFigures = "";
        int i = 0;
        while (i < shapeCollector.size()) {

            shapeCollector.get(i);
            String j = shapeCollector.getShapeName(i);
            showFigures += j;
            i++;
        }
        return showFigures;
    }

    public List<Shape> getShapeCollector() {
        return this.shapeCollector;
    }
}
