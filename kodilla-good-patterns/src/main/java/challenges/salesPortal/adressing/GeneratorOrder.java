package challenges.salesPortal.adressing;

import challenges.salesPortal.adressing.cart.Cart;
import challenges.salesPortal.adressing.cart.CartEntry;
import challenges.salesPortal.adressing.products.Games;
import challenges.salesPortal.adressing.products.Shoes;

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
