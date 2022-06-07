package com.kodilla.good.patterns;

import challenges.food2door.AssistanceOrder;
import challenges.food2door.Order;
import challenges.food2door.Service.BasicConnectivityService;
import challenges.food2door.Service.BasicOrderEngagingService;
import challenges.food2door.Service.BasicStatusRecovery;
import challenges.food2door.products.Carrot;
import challenges.food2door.products.ProductDTO;
import challenges.food2door.products.Tomato;
import challenges.food2door.suppliers.FoodSupplier;
import challenges.food2door.suppliers.HealthyShop;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        FoodSupplier supplier = new HealthyShop(new BasicConnectivityService(), new BasicStatusRecovery(), new BasicOrderEngagingService());
        Order order = generateOrder(supplier);

        System.out.println(supplier.getSupplyInformation());
        long orderId = supplier.process(order);
        System.out.println("Is order completed: " + supplier.isOrderComplete(orderId));
        Order orderHealthyFood = AssistanceOrder.healthyShopOrderGenerate();
        Order orderExtraFood = AssistanceOrder.extraFoodShopOrderGenerate();
        Order orderGlutenFree = AssistanceOrder.GlutenFreeShopOrderGenerate();
    }
    private static Order generateOrder(FoodSupplier supplier) {
        return new Order(supplier, List.of(
                new ProductDTO(new Carrot(), 50),
                new ProductDTO(new Tomato(), 100)
        ));
    }
}
