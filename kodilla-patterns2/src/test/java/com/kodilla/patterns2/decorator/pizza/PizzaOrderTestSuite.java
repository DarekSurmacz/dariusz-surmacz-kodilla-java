package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Ordered pizza: tomato sauce, chesse", description);
    }

    @Test
    public void testPremiumAdditivesGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PremiumAdditivesPizzaOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    public void testPremiumAdditivesGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PremiumAdditivesPizzaOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Ordered pizza: tomato sauce, chesse + premium additives", description);
    }

    @Test
    public void testPizzaPremiumWithMushroomsHypersonicSpeedDeliveryGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PremiumAdditivesPizzaOrderDecorator(theOrder);
        theOrder = new MushroomDecorator(theOrder);
        theOrder = new HypersonicSpeedDeliveryOrder(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(100000044.99), theCost);
    }

    @Test
    public void testPizzaPremiumWithMushroomsHypersonicSpeedDeliveryGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PremiumAdditivesPizzaOrderDecorator(theOrder);
        theOrder = new MushroomDecorator(theOrder);
        theOrder = new HypersonicSpeedDeliveryOrder(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Ordered pizza: tomato sauce, chesse + premium additives" +
                " + mushrooms + HYPERSONIC SPEED DELIVERY!!!", description);
    }
}
