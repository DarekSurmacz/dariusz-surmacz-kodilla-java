package challenges.food2door;

public class Application {

    public static void main(String[] args) {

        DeliveryRequest deliveryRequest = new DeliveryRequest
                ("Gluten Free Shop", "banana", 5, "kg");

        DeliveryProcessor deliveryProcessor = new DeliveryProcessor();
        deliveryProcessor.order(deliveryRequest);

    }
}