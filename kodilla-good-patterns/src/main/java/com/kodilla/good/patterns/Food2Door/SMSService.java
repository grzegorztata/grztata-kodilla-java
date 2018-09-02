package com.kodilla.good.patterns.Food2Door;

public class SMSService implements InformationService {

    @Override
    public void inform(boolean isOrdered) {
        if (isOrdered) {
            System.out.println("Order completed");
        } else {
            System.out.println("Order not confirmed");
        }
    }
}