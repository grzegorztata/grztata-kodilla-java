package com.kodilla.testing.shape;

public class Square implements Shape {
    private double a;
    private String name;

    public Square(String name, double a){
        this.name = name;
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double field = a * a;
        return field;
    }

    @Override
    public String toString() {
        return name + " with a length = " + a;
    }
}