package challenges.food2door.Service;

import challenges.food2door.Order;

public class BasicStatusRecovery implements StatusRecoveryService {

    @Override
    public boolean isOrderProcessed(Long id) {
        System.out.println("Requesting for order status.");
        return true;
    }

    @Override
    public Long getOrderId(Order order) {
        System.out.println("Requesting order ID");
        return Long.valueOf(1);
    }
}
