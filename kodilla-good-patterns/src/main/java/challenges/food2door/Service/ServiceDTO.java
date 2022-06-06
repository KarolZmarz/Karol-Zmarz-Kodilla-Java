package challenges.food2door.Service;

public class ServiceDTO {

    private SupplierConnectivityService connectivityService;
    private OrderEngagingService orderEngagingService;
    private StatusRecoveryService statusRecoveryService;

    public ServiceDTO(SupplierConnectivityService connectivityService, OrderEngagingService orderEngagingService, StatusRecoveryService statusRecoveryService) {
        this.connectivityService = connectivityService;
        this.orderEngagingService = orderEngagingService;
        this.statusRecoveryService = statusRecoveryService;
    }

    public SupplierConnectivityService getConnectivityService() {
        return connectivityService;
    }

    public OrderEngagingService getOrderEngagingService() {
        return orderEngagingService;
    }

    public StatusRecoveryService getStatusRecoveryService() {
        return statusRecoveryService;
    }
}
