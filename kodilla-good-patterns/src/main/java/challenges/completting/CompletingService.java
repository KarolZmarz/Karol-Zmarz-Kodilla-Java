package challenges.completting;

import challenges.cart.CartEntry;

import java.util.List;

public interface CompletingService {

    void displayItemsToBeIncluded(List<CartEntry> cartEntries);
}
