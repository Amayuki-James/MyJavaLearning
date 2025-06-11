package JavaClasses;
//Code from filename: ModAbstract.java
// Abstract class in Java is a class that cannot be instantiated on its own and must be subclassed.
abstract class ModAbstract {
    public String fname = "James";
    public int age = 25;
    public abstract void study(); // Abstract method (does not have a body)
    
}
// Subclass (inherited from ModAbstract)
class Student extends ModAbstract {
    public int graduationYear = 2025;
    public void study() { 
        // The body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
// End code from filename: ModAbstract.java


