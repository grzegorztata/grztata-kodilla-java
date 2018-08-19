package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double r;
    private String name;

    public Circle(String name, double r){
        this.name = name;
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double field = 3.14 * r * r;
        return field;
    }

    @Override
    public String toString() {
        return name + " with radius =  " + r;
    }
}