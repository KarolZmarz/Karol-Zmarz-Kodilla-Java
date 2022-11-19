package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizza() {
        //Given
        PizzaOrder order = new BasicPizza();
        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();
        //Then
        assertEquals(new BigDecimal(15), cost);
        assertEquals("Pizza with tomato sauce and mozzarella", description);
    }
    @Test
    public void testThickDoughPizzaWithGarlicSauce() {
        //Given
        PizzaOrder order = new BasicPizza();
        order = new ThickDoughPizzaDecorator(order);
        order = new ExtraSaucesDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();
        //Then
        assertEquals(new BigDecimal(26), cost);
        assertEquals("Pizza with tomato sauce and mozzarella - thick dough + sauces", description);
    }
    @Test
    public void testClassicDoughPizzaWithAllIngredients() {
        //Given
        PizzaOrder order = new BasicPizza();
        order = new ThinDoughPizzaDecorator(order);
        order = new ExtraCheeseDecorator(order);
        order = new ExtraMeatDecorator(order);
        order = new ExtraVeggiesDecorator(order);
        order = new ExtraSaucesDecorator(order);
        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();
        //Then
        assertEquals(new BigDecimal(30), cost);
        assertEquals("Pizza with tomato sauce and mozzarella - thin dough + extra cheese + meat + veggies + sauces", description);
    }
}
