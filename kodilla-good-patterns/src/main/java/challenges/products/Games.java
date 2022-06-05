package challenges.products;

public class Games implements Product {

    private final String name;

    public Games(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getAvailableAmount() {
        System.out.println("Check stock of" + name);
        return 6;
    }
}
