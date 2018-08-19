package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    public List<Shape> figures = new ArrayList<>();

    public List<Shape> getFigures() {
        return figures;
    }

    public void addFigure(Shape shape) {
        figures.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape result = null;
        if(figures.size() >= n) {
            Shape figure = figures.get(n);
            result = figure;
        }
        return result;
    }
    public String showFigures() {
        String result = "";
        for(Shape show : figures) {
            result += show.getShapeName();
        }
        return result;
    }
}
