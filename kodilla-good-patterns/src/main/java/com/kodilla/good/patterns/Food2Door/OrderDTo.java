package com.kodilla.good.patterns.Food2Door;

public class OrderDTo {
    private String product;
    private boolean isOrder;

    public OrderDTo(String product, boolean isOrder) {
        this.product = product;
        this.isOrder = isOrder;
    }

    public String getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrder;
    }

    @Override
    public String toString() {
        return "Order " + product + ", "+isOrder;
    }
}