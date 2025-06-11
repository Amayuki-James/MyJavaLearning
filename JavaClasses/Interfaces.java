package JavaClasses;
// Another way to achieve abtraction in Java, is with interfaces
// An interface is a completely abstract class that contains only abstract methods

// Interface
interface Animal {
    public void animalSound(); // interface method(does not hv a body)
    public void run(); // interface method(does not hv a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void run() {
        // The body of run() is provided here
        System.out.println("The pig is running");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.run();
    }
}
