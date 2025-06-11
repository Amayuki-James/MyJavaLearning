package Common;

public class MethodOverloading {
    // With method overloading, 
    // we can have multiple methods with the same name but different parameters.
    // This allows us to perform similar operations with different types of data.
    // For exmaple:
    static int intadd(int a, int b) {
        return a + b;
    }
    static double doubleadd(double a, double b) {
        return a + b;
    }
    // Instead of creating multiple methods with different names for different data types,
    // we can use method overloading to handle different types of data with the same method name.
    // This makes the code cleaner and easier to maintain.

    static int add(int a, int b) {
        return a + b;
    }
    static double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        int Result1 = add(5, 10); // Calls the first add method
        double Result2 = add(5.5, 10.5); // Calls the second add method
        System.out.println("Result of integer addition: " + Result1);
        System.out.println("Result of double addition: " + Result2);
    }
}
