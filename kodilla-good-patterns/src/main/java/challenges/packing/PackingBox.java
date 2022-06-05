package challenges.packing;

import challenges.Client;
import challenges.packing.PackingService;

public class PackingBox implements PackingService {

    @Override
    public void prepareContainer(Client client) {
        System.out.println("Prepare box for delivery. Client: " + client.getUserName());
    }
}
