package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();         // [8]
        // When
        BigDecimal calculatedCost = theOrder.getCost();    // [9]
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);   // [10]
    }                                                     // [11]

    @Test                                                 // [12]
    public void testBasicTaxiOrderGetDescription() {      // [13]
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();         // [14]
        // When
        String description = theOrder.getDescription();    // [15]
        // Then
        assertEquals("Ordered pizza: tomato sauce, chesse", description);       // [16]
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
