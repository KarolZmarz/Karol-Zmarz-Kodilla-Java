package challenges;

import challenges.adressing.AddressingService;
import challenges.adressing.CourierAddressEtiquette;
import challenges.completting.CompletePacking;
import challenges.completting.CompletingService;
import challenges.packing.PackingBox;
import challenges.packing.PackingService;

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
