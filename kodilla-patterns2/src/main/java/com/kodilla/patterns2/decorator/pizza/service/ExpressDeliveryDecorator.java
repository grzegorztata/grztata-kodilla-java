package com.kodilla.patterns2.decorator.pizza.service;

import com.kodilla.patterns2.decorator.pizza.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class ExpressDeliveryDecorator extends AbstractPizzaOrderDecorator {
    public ExpressDeliveryDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2.5));
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + delivery in 30 minutes";
    }
}
