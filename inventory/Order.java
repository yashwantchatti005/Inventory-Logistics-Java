package inventory;

public class Order {
    private int orderId;
    private Item item;
    private int quantity;

    public Order(int orderId, Item item, int quantity) {
        this.orderId = orderId;
        this.item = item;
        this.quantity = quantity;
    }

    public void processOrder() throws OutOfStockException {
        if (item.getQuantity() < quantity) {
            throw new OutOfStockException("Item out of stock!");
        }
        item.updateStock(quantity);
        System.out.println("Order processed successfully!");
    }

    public int getOrderId() {
        return orderId;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId +
               ", Item: " + item.getItemName() +
               ", Quantity: " + quantity;
    }
}
