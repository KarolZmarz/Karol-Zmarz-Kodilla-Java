package challenges.food2door;

import challenges.food2door.products.Product;
import challenges.food2door.suppliers.FoodSupplier;

import java.util.List;

public class SupplyDTO {

    private FoodSupplier supplier;
    private List<Product> products;

    public SupplyDTO(FoodSupplier supplier, List<Product> products) {
        this.supplier = supplier;
        this.products = products;
    }

    @Override
    public String toString() {
        return  "supplier: " + supplier +
                ", products: " + products;
    }
}
