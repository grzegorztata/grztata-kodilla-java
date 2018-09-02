package com.kodilla.good.patterns.Food2Door;

import java.util.Random;

public class HealthyShop implements Contractor {
    private Random random = new Random();

    @Override
    public String getContractorName() {
        return "HealthyShop";
    }

    @Override
    public boolean process(String product, int quantity) {
        System.out.println("Your order is ready ");
        return true;
    }
}