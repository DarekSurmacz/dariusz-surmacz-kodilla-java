package challenges.food2door;

import java.util.Objects;

public class GlutenFreeShop implements FoodSupplier {

    public boolean process(String foodSupplier, String product, int quantity, String unit) {
        if (((Objects.equals(unit, "kg")) && (quantity < 6))) {
            System.out.println("The " + foodSupplier + " can deliver product.");
            return true;
        } else {
            System.out.println("You have to order less / wrong unit.");
            return false;
        }
    }
}