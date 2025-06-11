package Practices.Others.DataStructure;

import java.util.HashMap;
import java.util.Scanner;

public class PHashMap {
    
    public void addProduct(HashMap<String, HashMap<Integer, Double>> trayList, String productName, double productPrice, int productQuantity) {
        // 取得或初始化該產品的資料
        HashMap<Integer, Double> innerMap = trayList.getOrDefault(productName, new HashMap<>());
        innerMap.put(productQuantity, productPrice);
        trayList.put(productName, innerMap);
    }

    public void showProducts(HashMap<String, HashMap<Integer, Double>> trayList) {
        System.out.println("\n--- Product Tray List ---");
        for (String product : trayList.keySet()) {
            System.out.println("Product: " + product);
            HashMap<Integer, Double> data = trayList.get(product);
            for (Integer quantity : data.keySet()) {
                System.out.println("  Quantity: " + quantity + " | Price: £" + data.get(quantity));
            }
        }
        System.out.println("--------------------------\n");
    }

    public static void main(String[] args){
        HashMap<String, HashMap<Integer, Double>> trayList = new HashMap<>();
        Scanner input = new Scanner(System.in);
        PHashMap handler = new PHashMap();

        System.out.println("Welcome to the Product Tray List!");
        System.out.println("Enter 'exit' as product name to stop.");

        while (true) {
            System.out.println("Enter the name of the product:");
            String productName = input.nextLine();
            if (productName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter the price of the product:");
            double productPrice = input.nextDouble();
            input.nextLine(); // 清除多餘換行

            if (productPrice <= 0) {
                System.out.println("Invalid price. Please enter a positive value.");
                continue;
            }

            System.out.println("Enter the quantity of the product:");
            int productQuantity = input.nextInt();
            input.nextLine(); // 清除多餘換行

            if (productQuantity <= 0) {
                System.out.println("Invalid quantity. Please enter a positive value.");
                continue;
            }

            handler.addProduct(trayList, productName, productPrice, productQuantity);
            System.out.println("Product added!\n");
        }

        handler.showProducts(trayList);
        input.close();
    }
}

    
