package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HypersonicSpeedDeliveryOrder extends AbstractPizzaOrderDecorator {
    public HypersonicSpeedDeliveryOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(99999999.99));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + HYPERSONIC SPEED DELIVERY!!!";
    }
}
