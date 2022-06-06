package challenges.food2door.suppliers;

import challenges.food2door.Service.ServiceDTO;
import challenges.food2door.products.Carrot;
import challenges.food2door.products.Product;
import challenges.food2door.products.Tomato;

import java.util.List;

public class HealthyShop extends FoodSupplier {

    public HealthyShop(ServiceDTO serviceDTO) {
        super(serviceDTO);
    }

    @Override
    public String getName() {
        return "HealthyShop";
    }

    @Override
    List<Product> getProduct() {
        return List.of(new Carrot(),
                       new Tomato());
    }
}
