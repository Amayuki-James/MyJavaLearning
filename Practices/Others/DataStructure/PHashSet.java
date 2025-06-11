package Practices.Others.DataStructure;
import java.util.HashSet;
import java.util.Scanner;

public class PHashSet {
    private HashSet<String> names;

    public PHashSet() {
        names = new HashSet<>();
    }

    public void addElement(String name) {
        names.add(name);
    }

    public static void main(String[] args) {
        PHashSet pHashSet = new PHashSet();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Hall of Fame!");
        System.out.println("We will be adding your name to the Hall of Fame.");

        while (true) {
            System.out.print("Please enter the name (or type 'exit' to quit): ");
            String name = input.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            if (pHashSet.names.contains(name)) {
                System.out.println("You are already in the Hall of Fame!");
            } else {
                pHashSet.addElement(name);
                System.out.println(name + " has been added!");
            }
        }

        input.close();
        System.out.println("\nFinal Hall of Fame:");
        for (String n : pHashSet.names) {
            System.out.println("- " + n);
        }
    }
}
