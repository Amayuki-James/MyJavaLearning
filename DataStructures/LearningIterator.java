package DataStructures;
import java.util.ArrayList;
import java.util.Iterator;

// An Iterator is an object that can be used to loop through a collection of elements.
// Such as ArrayList and HashSet, etc.
// It is called an "iterator" because "iterating" is the techincal term for Looping.

public class LearningIterator {
    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> race = new ArrayList<String>();
        race.add("Human");
        race.add("Elf");
        race.add("Dwarf");
        race.add("Gnome");
        race.add("Half-Elf");

        // Get the iterator
        Iterator<String> iterator = race.iterator();

        // Loop through the collection
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Remove an specific element from the collection
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("Elf")) {
                iterator.remove();
            }
        }

        // Showing list after removing an element
        System.out.println(race);
    }
    
}
