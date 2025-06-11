package DataStructures;
import java.util.ArrayList;
import java.util.Collections; // Importing necessary classes for sorting

//In the java.util package, there is the collections class which has methods to sort lists.

public class ListSorting {
    public static void main(String[] args) {
        // Sorting a list of operating systems
        ArrayList<String> OS = new ArrayList<String>();
        OS.add("Windows");
        OS.add("Linux");
        OS.add("MacOS");
        OS.add("Android");
        OS.add("iOS");

        Collections.sort(OS); // Sorting the list in ascending order

        for (String i : OS) {
            System.out.println(i); // Printing the sorted list
        }

        // Sort a list of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);
        Collections.sort(numbers); // Sorting the list in ascending order
        for (Integer i : numbers) {
            System.out.println(i); // Printing the sorted list
        }

        // Reverse sorting a list of integers
        Collections.sort(numbers, Collections.reverseOrder());
        for (Integer i : numbers) {
            System.out.println(i); // Printing the reverse sorted list
        }
    }
}
