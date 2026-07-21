
public class InventoryApp {

    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.getAllProducts().addAll(FilePersistence.loadInventory("inventory.txt"));

        manager.addProduct(new Electronics("E101", "Laptop", 10, 999.99, 24));
        manager.addProduct(new FoodItem("F202", "Milk", 30, 2.99, "2026-08-01"));

        manager.updateQuantity("E101", 8);

        FilePersistence.saveInventory(manager.getAllProducts(), "inventory.txt");

        System.out.println("Inventory saved.");
    }
}
