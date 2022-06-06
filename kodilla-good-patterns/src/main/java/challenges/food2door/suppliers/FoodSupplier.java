package challenges.food2door.suppliers;

import challenges.food2door.Order;
import challenges.food2door.Service.OrderEngagingService;
import challenges.food2door.Service.ServiceDTO;
import challenges.food2door.Service.StatusRecoveryService;
import challenges.food2door.Service.SupplierConnectivityService;
import challenges.food2door.SupplyDTO;
import challenges.food2door.products.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public abstract class FoodSupplier implements Supplier {

    List<Long> processedOrdersId = new ArrayList<>();

    SupplierConnectivityService supplierConnectivityService;
    OrderEngagingService orderEngagingService;
    StatusRecoveryService statusRecoveryService;

    public FoodSupplier(ServiceDTO serviceDTO) {
        this.supplierConnectivityService = serviceDTO.getConnectivityService();
        this.orderEngagingService = serviceDTO.getOrderEngagingService();
        this.statusRecoveryService = serviceDTO.getStatusRecoveryService();
    }
    @Override
    public SupplyDTO getSupplyInformation() {
        return new SupplyDTO(this, getProduct());
    }
    @Override
    public long process(Order order) {
        supplierConnectivityService.connectTo(this);

        orderEngagingService.fetchOrder(order);

        Long processId = statusRecoveryService.getOrderId(order);
        processedOrdersId.add(processId);
        return processId;
    }

    @Override
    public boolean isOrderComplete(Long id) {
        return statusRecoveryService.isOrderProcessed(id);
    }
    public abstract String getName();

    abstract List<Product> getProduct();

    @Override
    public String toString() {
        return "FoodSupplier: " + getName();
    }
}
