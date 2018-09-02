package com.kodilla.good.patterns.Food2Door;

public interface OrderService {
    boolean order(Contractor contractor, String product, int quantity);
}