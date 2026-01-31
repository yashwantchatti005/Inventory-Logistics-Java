package inventory;

public class RawMaterial extends Item {

    public RawMaterial(int itemId, String itemName, int quantity, double price) {
        super(itemId, itemName, quantity, price);
    }

    @Override
    public void updateStock(int qty) {
        quantity += qty; // raw material can be added anytime
    }
}
