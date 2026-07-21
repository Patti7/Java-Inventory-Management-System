
public class FoodItem extends Product {

    private final String expirationDate;

    public FoodItem(String id, String name, int quantity, double price, String expirationDate) {
        super(id, name, quantity, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String getCategory() {
        return "Food";
    }
}
