package DataStructures;
import java.util.ArrayList;
import java.util.Scanner;

// The arraylist class is a resizable arrau, which can be fount in the java.util package
/* The differemce between a built-in array and an ArrayList in java,
 * is that the size of an array cannot be modified.
 * while the elements can be added or removed from an ArrayList
*/
public class LearnArrayList {
    public static void main(String[] args){
        ArrayList<String> sports = new ArrayList<String>();
        sports.add("Football");
        sports.add("Basketball");
        sports.add("Tennis");
        sports.add("Badminton");
        System.out.println(sports);
        Scanner scanner = new Scanner(System.in);


        //Adding new elements
        boolean isPresent = false;
        System.out.println("Insert new sports name: ");
        String sportName1 = scanner.nextLine();
        for (int i = 0; i < sports.size(); i++) {
            if (sports.get(i).equalsIgnoreCase(sportName1)) {
                isPresent = true;
                break;
            }
        }
        if (!isPresent) {
            sports.add(sportName1);
        } else {
            System.out.println("Sport already exists in the list.");
        }
        System.out.println("Updated sports list: " + sports);
        
        // Access an element by index
        System.out.println("Enter the index of the element you want to access: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        if (index  >= 0 && index < sports.size()) {
            System.out.println("The element at index " + index + " is: " + sports.get(index));
        } else {
            System.out.println("Index out of bounds. Please enter a valid index.");
        }
        // OR Access by name
        System.out.println("Type the element you want to access: ");
        String sportName2 = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < sports.size(); i++){
            if (sports.get(i).equalsIgnoreCase(sportName2)){
                System.out.println("The element at index " + i + " is: " + sportName2);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the list.");
        }

        // Change an element by index
        System.out.println("Enter the index of the element you want to change: ");
        int changeIndex = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        if (changeIndex >= 0 && changeIndex < sports.size()) {
            System.out.println("Enter the new sports name you want to set: ");
            String newSportsName = scanner.nextLine();
            sports.set( changeIndex, newSportsName);
            System.out.println("Updated sports list: " + sports);
        } else {
            System.out.println("Enter a new valid index value: ");
        }
        // Remove an element by index
        System.out.println("Enter the index of the element you want to remove: ");
        int removeIndex = scanner.nextInt();
        if (removeIndex >= 0 && removeIndex < sports.size()) {
            sports.remove(removeIndex);
            System.out.println("Updated sports list after removal: " + sports);
        } else {
            System.out.println("Index out of bounds. Please enter a valid index.");
        }
        
        scanner.close();
    }
}
