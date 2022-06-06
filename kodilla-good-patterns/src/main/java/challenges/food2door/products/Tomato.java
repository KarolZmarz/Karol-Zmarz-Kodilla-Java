package challenges.food2door.products;

public class Tomato implements Product {
    @Override
    public String getProductName() {
        return "Tomato";
    }
    @Override
    public int getAccessibleAmount() {
        return 300;
    }
    @Override
    public String toString() {
        return "Tomato";
    }
}
