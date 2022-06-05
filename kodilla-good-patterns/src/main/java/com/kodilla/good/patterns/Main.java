package com.kodilla.good.patterns;

import challenges.Client;
import challenges.DeliveryDetails;
import challenges.Order;
import challenges.ProductOrderService;
import challenges.cart.Cart;
import challenges.cart.CartEntry;
import challenges.products.Games;
import challenges.products.Shoes;

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
