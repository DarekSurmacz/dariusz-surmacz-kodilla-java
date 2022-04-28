package challenges.order;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User ("Tigran", "Hamasyan", "43-300 Gdzieśtam, Jakaśtam 19/16");

        LocalDateTime orderFrom = LocalDateTime.of(2022, 04, 29, 00, 01);

        String deliveryMethod = "DHL";

        return new OrderRequest(user, orderFrom, deliveryMethod);
    }
}
