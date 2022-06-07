package challenges.food2door.suppliers;

import challenges.food2door.Order;
import challenges.food2door.SupplyDTO;

public interface Supplier {
    String getName();

    SupplyDTO getSupplyInformation();

    long process(Order order);

    boolean isOrderComplete(Long id);
}
