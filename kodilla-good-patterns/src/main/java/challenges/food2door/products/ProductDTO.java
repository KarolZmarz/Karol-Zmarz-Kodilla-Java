package challenges.food2door.products;

public class ProductDTO {

    private Product product;
    private int requestedQuantity;

    public ProductDTO(Product product, int requestedQuantity) {
        this.product = product;
        this.requestedQuantity = requestedQuantity;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "product: " + product +
                ", requestedQuantity:" + requestedQuantity;
    }
}
