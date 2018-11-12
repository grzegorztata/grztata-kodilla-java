package com.kodilla.patterns2.decorator.pizza.drinks;

import com.kodilla.patterns2.decorator.pizza.AbstractPizzaOrderDecorator;
import com.kodilla.patterns2.decorator.pizza.PizzaOrder;

import java.math.BigDecimal;

public class FantaDecorator extends AbstractPizzaOrderDecorator {
    public FantaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2.2));
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + bottle of Fanta 1L";
    }
}
