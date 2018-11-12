package com.kodilla.patterns2.decorator.pizza.service;

import com.kodilla.patterns2.decorator.pizza.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class DividedIntoPartsDecorator extends AbstractPizzaOrderDecorator {
    public DividedIntoPartsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(0.05));
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + divided into 8 parts";
    }
}
