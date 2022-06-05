package challenges.adressing;

import challenges.DeliveryDetails;
import challenges.adressing.AddressingService;

public class CourierAddressEtiquette implements AddressingService {

    @Override
    public void prepareAddressingEtiquette(DeliveryDetails deliveryDetails) {
        System.out.println("Address package to: " + deliveryDetails.getAddress());
    }
}
