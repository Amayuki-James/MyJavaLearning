package JavaClasses;
/* Abstraction is the process of hiding the implementation details of a class from the outside world.
 * Abstraction can be achieved with either abstract classes or interfaces.
 * 
 * Abstract class: is a restricted class that cannot be instantiated on its own and must be subclassed.
 * Abstract methods: are methods that are declared without an implementation, 
 *                   and must be overridden in the subclass.
 */

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzzzzz");
    }
}
// Subclass of Animal
class Dog extends Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The dog barks");
    }
}
public class Abstraction {
    public static void main(String[] args){
        Dog myDog = new Dog(); // Create a Pig object
        myDog.animalSound(); // Call the animalSound() method
        myDog.sleep(); // Call the sleep() method
    }
}
