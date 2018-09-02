package com.kodilla.good.patterns.Food2Door;

public class ShopService implements OrderService {

    @Override
    public boolean order(Contractor contractor, String product, int quantity) {
        System.out.println("The client takes " + quantity + " pcs of " + product + " from " + contractor.getContractorName());
        return contractor.process(product, quantity);
    }
}
