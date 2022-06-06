package com.kodilla.good.patterns;

import challenges.salesPortal.adressing.Client;
import challenges.salesPortal.adressing.DeliveryDetails;
import challenges.salesPortal.adressing.Order;
import challenges.salesPortal.adressing.ProductOrderService;
import challenges.salesPortal.adressing.cart.Cart;
import challenges.salesPortal.adressing.cart.CartEntry;
import challenges.salesPortal.adressing.products.Games;
import challenges.salesPortal.adressing.products.Shoes;

public class Main {

    public static void main(String[] args) {

        ProductOrderService productOrderService = new ProductOrderService();
        Order order = generateOrder();
    }
    private static Order generateOrder() {
        Client client = new Client("Karol");
        Cart cart = new Cart();
        cart.addCartEntry(new CartEntry(new Games("GTA V"), 1));
        cart.addCartEntry(new CartEntry(new Shoes("Nike runner"), 2));

        DeliveryDetails deliveryDetails = new DeliveryDetails("Krakow");

        return new Order(client, cart, deliveryDetails);
    }
}
