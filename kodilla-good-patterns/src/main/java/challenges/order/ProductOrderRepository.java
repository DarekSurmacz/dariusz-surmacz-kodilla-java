package challenges.order;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    public void createOrder(User user, LocalDateTime from, String deliveryMethod) {
        System.out.println("New order has been created.");
    }
}
