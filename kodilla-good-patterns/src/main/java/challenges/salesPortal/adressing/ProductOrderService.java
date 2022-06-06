package challenges.salesPortal.adressing;

import challenges.salesPortal.adressing.AddressingService;
import challenges.salesPortal.adressing.Order;
import challenges.salesPortal.adressing.completting.CompletingService;
import challenges.salesPortal.adressing.packing.PackingService;

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
