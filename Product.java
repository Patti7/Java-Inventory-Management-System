
public abstract class Product {

    private final String id;
    private final String name;
    private int quantity;
    private final double price;

    public Product(String id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract String getCategory();

    @Override
    public String toString() {
        return id + "," + name + "," + quantity + "," + price + "," + getCategory();
    }
}
