package challenges.food2door;

import challenges.food2door.Service.BasicConnectivityService;
import challenges.food2door.Service.BasicOrderEngagingService;
import challenges.food2door.Service.BasicStatusRecovery;
import challenges.food2door.Service.ServiceDTO;
import challenges.food2door.products.*;
import challenges.food2door.suppliers.ExtraFoodShop;
import challenges.food2door.suppliers.FoodSupplier;
import challenges.food2door.suppliers.GlutenFreeShop;
import challenges.food2door.suppliers.HealthyShop;

import java.util.List;
import java.util.function.Supplier;

public class AssistanceOrder {

    private AssistanceOrder() {
    }

    public static void executeOrderProcess(Order order) {
        System.out.println("\n");

        FoodSupplier supplier = order.getFoodSupplier();

        System.out.println(supplier.getSupplyInformation());
        long orderId = supplier.process(order);
        System.out.println("Is order completed: " + supplier.isOrderComplete(orderId));

        System.out.println("\n");
    }

    public static ServiceDTO serviceDTOGenerate() {
        return new ServiceDTO(new BasicConnectivityService(), new BasicOrderEngagingService(), new BasicStatusRecovery());
    }
    public static Order healthyShopOrderGenerate() {
        return new Order(new HealthyShop(serviceDTOGenerate()),
                List.of(new ProductDTO(new Tomato(), 100),
                        new ProductDTO(new Carrot(), 50)));
    }
    public static Order extraFoodShopOrderGenerate() {
        return new Order(new ExtraFoodShop(serviceDTOGenerate()),
                List.of(new ProductDTO(new Orange(), 43),
                        new ProductDTO(new Apple(), 40)));
    }
    public static Order GlutenFreeShopOrderGenerate() {
        return new Order(new GlutenFreeShop(serviceDTOGenerate()),
                List.of(new ProductDTO(new Cake(), 5),
                        new ProductDTO(new Pancake(),10)));
    }
}
