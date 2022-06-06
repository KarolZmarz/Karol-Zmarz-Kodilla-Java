package challenges.salesPortal.adressing.completting;

import challenges.salesPortal.adressing.cart.CartEntry;

import java.util.List;

public class CompletePacking implements CompletingService {

    @Override
    public void displayItemsToBeIncluded(List<CartEntry> cartEntries) {
        cartEntries.forEach(cartEntry -> System.out.println(cartEntry.getProduct().getName() + "in amount of: " + cartEntry.getRequestedAmount()));
    }
}
