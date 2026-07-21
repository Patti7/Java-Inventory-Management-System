
import java.util.ArrayList;

public class InventoryManager {

    private final ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public Product searchById(String id) {
        for (Product p : products) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Product> searchByName(String name) {
        ArrayList<Product> results = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                results.add(p);
            }
        }
        return results;
    }

    public boolean updateQuantity(String id, int newQty) {
        Product p = searchById(id);
        if (p != null) {
            p.setQuantity(newQty);
            return true;
        }
        return false;
    }

    public ArrayList<Product> getAllProducts() {
        return products;
    }
}
