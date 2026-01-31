package inventory;

public class FinishedGoods extends Item {

    public FinishedGoods(int itemId, String itemName, int quantity, double price) {
        super(itemId, itemName, quantity, price);
    }

    @Override
    public void updateStock(int qty) {
        if (quantity - qty >= 0) {
            quantity -= qty;
        } else {
            System.out.println("Not enough stock for finished goods!");
        }
    }
}
