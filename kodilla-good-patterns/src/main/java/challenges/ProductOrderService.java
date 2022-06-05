package challenges;

import challenges.adressing.AddressingService;
import challenges.completting.CompletingService;
import challenges.packing.PackingService;
import challenges.packing.PackingBox;
import challenges.adressing.CourierAddressEtiquette;
import challenges.completting.CompletePacking;

public class ProductOrderService {

    PackingService packingService;
    AddressingService addressingService;
    CompletingService completingService;

    public ProductOrderService(PackingService packingService, AddressingService addressingService, CompletingService completingService) {
        this.packingService = packingService;
        this.addressingService = addressingService;
        this.completingService = completingService;
    }

    public ProductOrderService() {

    }

    public boolean executeOrder(Order order) {
        if(!order.isValid())
            return false;

        packingService.prepareContainer(order.getClient());
        addressingService.prepareAddressingEtiquette(order.getDeliveryDetails());
        completingService.displayItemsToBeIncluded(order.getCart().getCartEntries());

        return true;
    }
}
