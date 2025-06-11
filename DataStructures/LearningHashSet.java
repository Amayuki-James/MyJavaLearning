package DataStructures;
import java.util.HashSet; // Importing the HashSet class from java.util package

// A HashSet is a collection of items where every item is unique and it is found in the java.util package.

public class LearningHashSet {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("apple"); // Adding a duplicate element will not be added to the HashSet

        System.out.println("HashSet: " + fruits);

        // Check if an element exists in the HashSet
        System.out.println("Is 'apple' in the HashSet? " + fruits.contains("apple"));

        // Remove an element from the HashSet
        fruits.remove("cherry");
        System.out.println("After removing 'cherry': " + fruits);

        // Get the size of the HashSet
        System.out.println("Size of the HashSet: " + fruits.size());

        // Clear the HashSet
        fruits.clear();
        System.out.println("After clearing the HashSet: " + fruits);
        

    }
}
