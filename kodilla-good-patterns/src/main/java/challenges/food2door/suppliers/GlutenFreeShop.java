package challenges.food2door.suppliers;

import challenges.food2door.Service.ServiceDTO;
import challenges.food2door.products.Cake;
import challenges.food2door.products.Pancake;
import challenges.food2door.products.Product;

import java.util.List;

public class GlutenFreeShop extends FoodSupplier {

    public GlutenFreeShop(ServiceDTO serviceDTO) {
        super(serviceDTO);
    }
    @Override
    public String getName() {
        return "GlutenFreeShop";
    }
    @Override
    List<Product> getProduct() {
        return List.of(new Cake(),
                       new Pancake());
    }
}
