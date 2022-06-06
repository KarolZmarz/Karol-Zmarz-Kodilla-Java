package challenges.food2door.suppliers;

import challenges.food2door.SupplyDTO;
import challenges.food2door.Order;

public interface Supplier {

    String getName();

    SupplyDTO getSupplyInformation();

    long process(Order order);

    boolean isOrderComplete(Long id);
}
