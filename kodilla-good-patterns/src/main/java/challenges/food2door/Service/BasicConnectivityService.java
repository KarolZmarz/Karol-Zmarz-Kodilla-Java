package challenges.food2door.Service;

import challenges.food2door.suppliers.FoodSupplier;

public class BasicConnectivityService implements SupplierConnectivityService {

    @Override
    public void connectTo(FoodSupplier foodSupplier) {
        System.out.println("Connecting to " + foodSupplier.getName());
    }
}
