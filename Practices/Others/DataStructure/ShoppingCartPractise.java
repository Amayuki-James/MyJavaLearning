package Practices.Others.DataStructure;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

class CartItem {
    private String name;
    private double price;
    private int quantity;

    public CartItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " - " + quantity + " pcs - £" + price;
    }
}

class ShoppingCart {
    private ArrayList<CartItem> cart = new ArrayList<>();

    public void addProductToCart(String name, double price, int quantity) {
        cart.add(new CartItem(name, price, quantity));
    }

    public void cleanCart() {
        Iterator<CartItem> it = cart.iterator();
        while (it.hasNext()) {
            CartItem item = it.next();
            if (item.getQuantity() == 0 || item.getPrice() == 0.0) {
                it.remove();
            }
        }
    }

    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Your shopping cart:");
            for (CartItem item : cart) {
                System.out.println("- " + item);
            }
        }
    }
}
public class ShoppingCartPractise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        // 加入幾筆商品（含不合法數據）
        cart.addProductToCart("Apple", 1.2, 5);
        cart.addProductToCart("Banana", 0.5, 0);
        cart.addProductToCart("Orange", 0.0, 3); 
        cart.addProductToCart("Mango", 2.0, 2);

        System.out.println("\nBefore cleanup:");
        cart.viewCart();

        cart.cleanCart();

        System.out.println("\nAfter cleanup:");
        cart.viewCart();

        input.close();
    }
}


