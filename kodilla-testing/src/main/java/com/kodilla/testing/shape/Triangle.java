package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double a;
    private double h;
    private String name;

    public Triangle(String name, double a, double h){
        this.name = name;
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }
    public double getH() {
        return h;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double field = 0.50 * a * h;
        return field;
    }

    @Override
    public String toString() {
        return name + "with bottom length = " + a + " and height " + h;
    }
}
