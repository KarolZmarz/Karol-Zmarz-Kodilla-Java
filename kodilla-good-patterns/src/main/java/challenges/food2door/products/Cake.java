package challenges.food2door.products;

public class Cake implements Product {

    @Override
    public String getProductName() {
        return "Cake";
    }
    @Override
    public int getAccessibleAmount() {
        return 20;
    }
    @Override
    public String toString() {
        return "Cake";
    }
}
