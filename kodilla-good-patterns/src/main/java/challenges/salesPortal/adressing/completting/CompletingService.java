package challenges.salesPortal.adressing.completting;

import challenges.salesPortal.adressing.cart.CartEntry;

import java.util.List;

public interface CompletingService {

    void displayItemsToBeIncluded(List<CartEntry> cartEntries);
}
