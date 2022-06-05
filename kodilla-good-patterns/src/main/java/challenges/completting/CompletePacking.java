package challenges.completting;

import challenges.cart.CartEntry;
import challenges.completting.CompletingService;

import java.util.List;

public class CompletePacking implements CompletingService {

    @Override
    public void displayItemsToBeIncluded(List<CartEntry> cartEntries) {
        cartEntries.forEach(cartEntry -> System.out.println(cartEntry.getProduct().getName() + "in amount of: " + cartEntry.getRequestedAmount()));
    }
}
