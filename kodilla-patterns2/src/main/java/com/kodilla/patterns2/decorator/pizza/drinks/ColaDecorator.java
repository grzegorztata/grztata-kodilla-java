package com.kodilla.patterns2.decorator.pizza.drinks;

import com.kodilla.patterns2.decorator.pizza.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class ColaDecorator extends AbstractPizzaOrderDecorator {
    public ColaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2.75));
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + bottle of cola 1L";
    }
}
