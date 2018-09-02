package com.kodilla.good.patterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    List<OrderRequest> examples() {
        List<OrderRequest> ordersFromClient = new ArrayList<>();
        ordersFromClient.add(new OrderRequest(new HealthyShop(), "CornFlakes", 10));
        ordersFromClient.add(new OrderRequest(new ExtraFoodShop(), "IndianSauce", 10));
        ordersFromClient.add(new OrderRequest(new GlutenFreeShop(), "BrownBread", 10));
        return ordersFromClient;
    }
}