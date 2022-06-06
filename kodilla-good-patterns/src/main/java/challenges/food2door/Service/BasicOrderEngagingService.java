package challenges.food2door.Service;

import challenges.food2door.Order;

public class BasicOrderEngagingService implements OrderEngagingService{

    @Override
    public void fetchOrder(Order order) {
        System.out.println("Sending order");
        System.out.println(order.toString());
    }
}
