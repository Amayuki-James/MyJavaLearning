package Practices.Others.DataStructure;
import java.util.ArrayList;
import java.util.Scanner;

// Define a CartItem class with an addProduct method
class CartItem {
    public void addProduct(String productName, double productPrice, int productQuantity) {
        System.out.println("Adding product: " + productName + " Price: " + productPrice + " Quantity: " + productQuantity);
    }
}
class ShoppingCart {
    private ArrayList<CartItem> cart;

    public ShoppingCart() {
        cart = new ArrayList<CartItem>();
    }

    public void addProductToCart(String productName, double productPrice, int productQuantity) {
        for (CartItem item : cart) {
            item.addProduct(productName, productPrice, productQuantity);
        }
    }

    public void addCartItem(CartItem item) {
        cart.add(item);
    }
    public void viewCart() {
        for (CartItem item : cart) {
            System.out.println(item);
        }
    }
}

public class ShoppingCartPractise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create a ShoppingCart instance
        ShoppingCart cart = new ShoppingCart();

        // Add some CartItem instances to the cart
        for (int i = 0; i < 5; i++) {
            cart.addCartItem(new CartItem());
        }

        // Input product details
        System.out.println("Input product name: ");
        String productName = input.nextLine();
        System.out.println("Input product price: ");
        double productPrice = input.nextDouble();
        System.out.println("Input product quantity: ");
        int productQuantity = input.nextInt();

        // Add products to the cart
        cart.addProductToCart(productName, productPrice, productQuantity);

        // View the cart
        cart.viewCart();

        // Close the scanner
        input.close();
    }
}
