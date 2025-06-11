package DataStructures;
import java.util.HashMap; // Importing the HashMap class from java.util package

// HashMap store items in "Key/Value" pairs, and can be access by an index of a key.
// One object is used as a key (index) to another object (value). It can store different types:
// String keys and Integer values, or Integer keys and String values, etc.

public class LearningHashMap {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String,String>();
        
        //Add keys and values (Country, City)
        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington D.C.");
        capitalCities.put("Japan","Tokyo");
        System.out.println(capitalCities);
        // Access an item
        System.out.println("The capital of England is: " + capitalCities.get("England"));
        System.out.println("The capital of Japan is: " + capitalCities.get("Tokyo")); //returns null since Tokyo is not a key
        // Remove an item
        capitalCities.remove("Germany");
        System.out.println("After removing Germany: " + capitalCities);
        // Check if a key exists
        if (capitalCities.containsKey("Norway")) {
            System.out.println("The capital of Norway is: " + capitalCities.get("Norway"));
        } else {
            System.out.println("Norway is not in the map.");
        }
        // Check if a value exists
        if (capitalCities.containsValue("Oslo")) {
            System.out.println("Oslo is a capital city in the map.");
        } else {
            System.out.println("Oslo is not in the map.");
        }
        // Get the size of the HashMap
        System.out.println("The size of the HashMap is: " + capitalCities.size());
        // Loop  through the HashMap
        System.out.println("Iterating through the HashMap:");
        for (String country : capitalCities.keySet()) {
            System.out.println("The capital of " + country + " is: " + capitalCities.get(country));
        }
        // Clear the HashMap
        capitalCities.clear();
        System.out.println("After clearing, the HashMap is: " + capitalCities);
        // Check if the HashMap is empty
        if (capitalCities.isEmpty()) {
            System.out.println("The HashMap is empty.");
        }
        else {
            System.out.println("The HashMap is not empty.");
        }
    }
}
