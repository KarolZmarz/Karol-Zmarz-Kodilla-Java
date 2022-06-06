package challenges.food2door.products;

public class Apple implements Product {

    @Override
    public String getProductName() {
        return "Apple";
    }
    @Override
    public int getAccessibleAmount() {
        return 400;
    }
    @Override
    public String toString() {
        return "Apple";
    }
}
