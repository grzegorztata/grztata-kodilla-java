package com.kodilla.good.patterns.Food2Door;

public class OrderProcessor {
    private OrderService orderService;
    private InformationService informationService;

    public OrderProcessor(OrderService orderService, InformationService informationService) {
        this.orderService = orderService;
        this.informationService = informationService;
    }

    public OrderDTo process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getContractor(), orderRequest.getProduct(), orderRequest.getQuantity());
        informationService.inform(isOrdered);
        return new OrderDTo(orderRequest.getProduct(),isOrdered);
    }
}