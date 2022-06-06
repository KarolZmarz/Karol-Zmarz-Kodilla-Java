package challenges.salesPortal.adressing;

import challenges.salesPortal.adressing.*;
import challenges.salesPortal.adressing.completting.CompletePacking;
import challenges.salesPortal.adressing.completting.CompletingService;
import challenges.salesPortal.adressing.packing.PackingBox;
import challenges.salesPortal.adressing.packing.PackingService;

public class ServiceSolutionRunner {

    public static void runSolution() {

        PackingService packingService = new PackingBox();
        AddressingService addressingService = new CourierAddressEtiquette();
        CompletingService completingService = new CompletePacking();

        ProductOrderService productOrderService = new ProductOrderService(packingService, addressingService, completingService);
        Order order = GeneratorOrder.generateOrder();
        productOrderService.executeOrder(order);

    }
}
