package JavaClasses;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter username: ");
        String userName = myObj.nextLine(); // Read user input
        System.out.println("Username is: " + userName);
        // There are serveral input Types in Java, such as int, double, String, etc.
        System.out.println("Enter your age: ");
        int age = myObj.nextInt(); // Read user input
        System.out.println("Your age is: " + age);
        System.out.println("Enter your height: ");
        double height = myObj.nextDouble(); // Read user input
        System.out.println("Your height is: " + height);
        System.out.println("Enter your weight: ");
        float weight = myObj.nextFloat(); // Read user input
        System.out.println("Your weight is: " + weight);
        // Remeber to close the scanner to prevent resources leakage
        myObj.close();
    }
}
