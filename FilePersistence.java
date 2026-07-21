
import java.io.*;
import java.util.*;

public class FilePersistence {

    public static void saveInventory(ArrayList<Product> products, String filename) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            for (Product p : products) {
                pw.println(p.toString());
            }
        } catch (IOException e) {
            System.out.println("Error saving inventory: " + e.getMessage());
        }
    }

    public static ArrayList<Product> loadInventory(String filename) {
        ArrayList<Product> products = new ArrayList<>();

        try (Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNextLine()) {
                String[] data = sc.nextLine().split(",");
                String id = data[0];
                String name = data[1];
                int qty = Integer.parseInt(data[2]);
                double price = Double.parseDouble(data[3]);
                String category = data[4];

                Product p = switch (category) {
                    case "Electronics" ->
                        new Electronics(id, name, qty, price, 12);
                    case "Food" ->
                        new FoodItem(id, name, qty, price, "N/A");
                    default ->
                        null;
                };

                if (p != null) {
                    products.add(p);
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading inventory: " + e.getMessage());
        }

        return products;
    }
}
