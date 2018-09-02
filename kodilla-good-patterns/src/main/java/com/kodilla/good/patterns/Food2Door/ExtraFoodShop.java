package com.kodilla.good.patterns.Food2Door;

public class ExtraFoodShop implements Contractor {

    @Override
    public String getContractorName() {
        return "ExtraFoodShop";
    }

    @Override
    public boolean process(String product, int quantity) {
        System.out.println("Your order is ready ");
        return true;
    }
}