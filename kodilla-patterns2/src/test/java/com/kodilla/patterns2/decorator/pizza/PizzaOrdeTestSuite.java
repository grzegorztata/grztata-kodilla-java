package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.discounts.DiscountCodeDecorator;
import com.kodilla.patterns2.decorator.pizza.drinks.ColaDecorator;
import com.kodilla.patterns2.decorator.pizza.drinks.FantaDecorator;
import com.kodilla.patterns2.decorator.pizza.ingredients.ExtraCheeseDecorator;
import com.kodilla.patterns2.decorator.pizza.ingredients.ExtraMeatDecorator;
import com.kodilla.patterns2.decorator.pizza.ingredients.ExtraMushroomsDecorator;
import com.kodilla.patterns2.decorator.pizza.ingredients.ExtraSauceDecorator;
import com.kodilla.patterns2.decorator.pizza.service.NightServiceDecorator;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrdeTestSuite {
    @Test
    public void testFirstGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraMushroomsDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ColaDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza with tomato sauce + extra mushrooms + extra cheese + bottle of cola 1L", description);
    }
    @Test
    public void testFirstGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraMushroomsDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ColaDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(22.25), theCost);
    }
    @Test
    public void testGetDescriptionWithDiscount() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraMeatDecorator(theOrder);
        theOrder = new ExtraSauceDecorator(theOrder);
        theOrder = new FantaDecorator(theOrder);
        theOrder = new NightServiceDecorator(theOrder);
        theOrder = new DiscountCodeDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza with tomato sauce + extra meat + extra sauce + bottle of Fanta 1L + night service\n(Customer also have a discount Code - 3 PLN)", description);
    }
}
