package challenges;

import challenges.cart.Cart;
import challenges.cart.CartEntry;
import challenges.products.Games;
import challenges.products.Shoes;

public class GeneratorOrder {

    public static Order generateOrder() {

        Client client = new Client("Karol");
        Cart cart = new Cart();
        cart.addCartEntry(new CartEntry(new Games("GTA V"), 1  ));
        cart.addCartEntry(new CartEntry(new Shoes("Nike runner"), 2  ));

        DeliveryDetails deliveryDetails = new DeliveryDetails("Krakow");

        return new Order(client, cart, deliveryDetails);
    }
}
