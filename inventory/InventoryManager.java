package inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

    private List<Item> items = new ArrayList<>();
    private List<Order> orders = new ArrayList<>(); 

    public void addItem(Item item) {
        items.add(item);
    }

    public Item findItem(int id) {
        for (Item i : items) {
            if (i.getItemId() == id) {
                return i;
            }
        }
        return null;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void showOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders placed yet!");
            return;
        }

        System.out.println("\n--- Placed Orders ---");
        for (Order o : orders) {
            System.out.println(o);
        }
    }

    public void showInventory() {
        for (Item i : items) {
            System.out.println(
                i.getItemId() + " | " +
                i.getItemName() + " | Qty: " +
                i.getQuantity() + " | Price: " +
                i.getPrice()
            );
        }
    }
}
