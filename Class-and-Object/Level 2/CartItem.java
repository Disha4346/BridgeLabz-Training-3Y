import java.util.ArrayList;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public static void main(String[] args) {
        ArrayList<CartItem> cart = new ArrayList<>();

        CartItem item1 = new CartItem("Notebook", 50.0, 2);
        CartItem item2 = new CartItem("Pen", 10.0, 5);

        cart.add(item1);
        cart.add(item2);

        double total = 0;
        for (CartItem item : cart) {
            System.out.println(item.itemName + " x" + item.quantity + " = ₹" + item.getTotalCost());
            total += item.getTotalCost();
        }

        System.out.println("Total Cart Cost: ₹" + total);
    }
}
