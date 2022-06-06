package challenges.food2door.products;

public class Orange implements Product {

    @Override
    public String getProductName() {
        return "Orange";
    }
    @Override
    public int getAccessibleAmount() {
        return 300;
    }
    @Override
    public String toString() {
        return "Orange";
    }
}
