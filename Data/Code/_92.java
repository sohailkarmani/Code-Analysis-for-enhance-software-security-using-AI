// ShoppingCart.java
import java.util.ArrayList;

public class _92{
    private ArrayList<String> items;

    public _92() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }

    public static void main(String[] args) {
        _92 cart = new _92();
        cart.addItem("Laptop");
        cart.addItem("Headphones");
        cart.displayItems();
        cart.removeItem("Headphones");
        cart.displayItems();
    }}