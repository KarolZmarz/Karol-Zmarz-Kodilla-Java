package challenges.food2door.products;

public class Pancake implements Product {
    @Override
    public String getProductName() {
        return "Pancake";
    }
    @Override
    public int getAccessibleAmount() {
        return 50;
    }
    @Override
    public String toString() {
        return "Pancake";
    }
}
