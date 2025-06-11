package JavaClasses;

public class Constructor {
    // A constructor is a special method that is called when an object is instantiated.
    // It is called when an object of a class is created. 
    // It can be used to set initial values for object attributes.

    int x; // Create a class attribute

    //Create a class constructor for the Main class
    public Constructor(){
        x = 5; // Set the initial value of x to 5
    }

    public static void main(String[] args){
        Constructor myobj = new Constructor(); // Create an object of class Constructors(Main)
        System.out.println(myobj.x); // Print the value of x
        // Output: 5
    }
}