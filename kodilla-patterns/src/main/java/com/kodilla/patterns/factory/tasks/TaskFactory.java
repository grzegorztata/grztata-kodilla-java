package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Go To Grocery", "Milk", 1);
            case PAINTINGTASK:
                return new PaintingTask("Painting", "brown", "fence");
            case DRIVINGTASK:
                return new DrivingTask("Go To Work","Greenstreet 116", "car");
            default:
                return null; // koniec
        }
    }
}