package challenges.food2door;

import challenges.food2door.products.ProductDTO;
import challenges.food2door.suppliers.FoodSupplier;

import java.util.List;

public class Order {

    private final FoodSupplier foodSupplier;
    private final List<ProductDTO> products;

    public Order(FoodSupplier foodSupplier, List<ProductDTO> products) {
        this.foodSupplier = foodSupplier;
        this.products = products;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }

    @Override
    public String toString() {
        return "Order{" +
                "foodSupplier=" + foodSupplier +
                ", products=" + products +
                '}';
    }
}
