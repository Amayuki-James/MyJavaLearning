package JavaClasses;

public class ModFinal {
    final int x = 10; // A final variable cannot be changed once initialized
    final double PI = 3.14159; // A final variable for a constant value

    public static void main(String[] args) {
        ModFinal obj = new ModFinal();
        System.out.println("Value of x: " + obj.x); // Output: Value of x: 10
        System.out.println("Value of PI: " + obj.PI); // Output: Value of PI: 3.14159
        
        // Uncommenting the following lines will cause a compilation error
        // obj.x = 20; // Error: cannot assign a value to final variable x
        // obj.PI = 3.14; // Error: cannot assign a value to final variable PI
    }
}
