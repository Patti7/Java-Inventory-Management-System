
public class Electronics extends Product {

    private final int warrantyMonths;

    public Electronics(String id, String name, int quantity, double price, int warrantyMonths) {
        super(id, name, quantity, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    @Override
    public String getCategory() {
        return "Electronics";
    }
}
