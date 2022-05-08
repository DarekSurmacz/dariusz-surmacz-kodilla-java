package challenges.food2door;

public class ExtraFoodShop implements FoodSupplier {

    public boolean process(String foodSupplier, String product, int quantity, String unit) {
        if (quantity > 0) {
            System.out.println("The " + foodSupplier + " can deliver product.");
            return true;
        } else {
            System.out.println("Please order something.");
            return false;
        }
    }
}