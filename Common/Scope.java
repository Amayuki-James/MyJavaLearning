package Common;

public class Scope {
    // In Java, the scope of a variable is determined by where it is declared.
    // Variables can be declared in different scopes, such as:
    // 1. Class scope: Variables declared inside a class but outside any method.
    // 2. Method scope: Variables declared inside a method.
    // 3. Block scope: Variables declared inside a block of code (e.g., inside curly braces).q
    // 4. Local scope: Variables declared inside a method or block.
    // 5. Global scope: Variables declared outside any method or class.
    // 6. Static scope: Variables declared with the static keyword.
    // And etc...

    // Method scope
    public class Main {
        public static void main(String[] args) {
            // Block start here
            // code here cannot use the variable 'x' because it is declared in a different scope
            {
            int x = 10; // Method scope
            System.out.println("Value of x: " + x); // This will work
            }
            // Block end here
            // code here cannot use the variable 'x' because it is declared in a different scope
        }
    }
}
