package challenges.food2door;

public class DeliveryRequest {
    private final String foodSupplier;
    private final String product;
    private final int quantity;
    private final String unit;

    public DeliveryRequest(String foodSupplier, String product, int quantity, String unit) {
        this.foodSupplier = foodSupplier;
        this.product = product;
        this.quantity = quantity;
        this.unit = unit;
    }

    public String getFoodSupplier() {
        return foodSupplier;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }
}