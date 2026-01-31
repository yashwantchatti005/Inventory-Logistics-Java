package inventory;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();
        Scanner sc = new Scanner(System.in);
// These are the items inside in inventory
        manager.addItem(new RawMaterial(1, "Steel", 100, 50));
        manager.addItem(new FinishedGoods(2, "Laptop", 20, 50000));
        manager.addItem(new RawMaterial(3, "Plastic", 200, 20));
        manager.addItem(new RawMaterial(4, "Copper", 150, 70));

        manager.addItem(new FinishedGoods(5, "Mobile Phone", 50, 20000));
        manager.addItem(new FinishedGoods(6, "Headphones", 80, 1500));
        manager.addItem(new FinishedGoods(7, "Keyboard", 60, 1200));


        while (true) {
            System.out.println("\n--- Inventory & Logistics Menu ---");
            System.out.println("1. View Inventory");
            System.out.println("2. Place Order");
            System.out.println("3. View Placed Orders"); 
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
// switch case
            switch (choice) {
            case 1:
                manager.showInventory();
                break;

            case 2:
                System.out.print("Enter Item ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();

                Item item = manager.findItem(id);
                if (item != null) {
                    Order order = new Order(101 + (int)(Math.random() * 1000), item, qty);
                    try {
                        order.processOrder();
                        manager.addOrder(order); 
                    } catch (OutOfStockException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("Item not found!");
                }
                break;

            case 3:
                manager.showOrders(); 
                break;

            case 4:
                System.out.println("Exiting system...");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice!");
        }

        }
    }
}
