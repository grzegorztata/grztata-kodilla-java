package com.kodilla.good.patterns.Food2Door;

public class Application {
    public static void main(String[] args) {
        OrderExample orderExample = new OrderExample();
        OrderProcessor orderProcessor = new OrderProcessor(new ShopService(), new SMSService());

        for (OrderRequest orderRequest : orderExample.examples()) {
            System.out.println(orderProcessor.process(orderRequest));
            System.out.println();
        }
    }
}