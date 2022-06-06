package challenges.food2door.products;

public class Carrot implements Product {
    @Override
    public String getProductName() {
        return "Carrot";
    }
    @Override
    public int getAccessibleAmount() {
        return 300;
    }
    @Override
    public String toString() {
        return "Carrot";
    }
}
