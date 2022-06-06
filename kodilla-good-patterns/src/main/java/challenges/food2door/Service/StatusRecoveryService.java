package challenges.food2door.Service;

import challenges.food2door.Order;

public interface StatusRecoveryService {

    boolean isOrderProcessed(Long id);

    Long getOrderId(Order order);
}
