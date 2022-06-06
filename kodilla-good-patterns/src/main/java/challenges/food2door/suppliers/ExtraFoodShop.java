package challenges.food2door.suppliers;

import challenges.food2door.Service.ServiceDTO;
import challenges.food2door.products.Apple;
import challenges.food2door.products.Orange;
import challenges.food2door.products.Product;

import java.util.List;

public class ExtraFoodShop extends FoodSupplier {

    private final String name = "ExtraFoodShop";

    public ExtraFoodShop(ServiceDTO serviceDTO) {
        super(serviceDTO);
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    List<Product> getProduct() {
        return List.of(new Orange(),
                       new Apple());
    }
}
