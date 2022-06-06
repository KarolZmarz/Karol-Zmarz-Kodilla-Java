package challenges.salesPortal.adressing.packing;

import challenges.salesPortal.adressing.Client;

public class PackingBox implements PackingService {

    @Override
    public void prepareContainer(Client client) {
        System.out.println("Prepare box for delivery. Client: " + client.getUserName());
    }
}
