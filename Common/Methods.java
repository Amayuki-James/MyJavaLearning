package Common;

public class Methods {
    // Create a method
    static void Method1() {
        System.out.println("Method1");
    }
    static void Method2(int a, int b) {
        System.out.println("Method2: " + a + ", " + b);
    }
    static int Method3(int a, int b) {
        System.out.println("Method3: " + a + ", " + b);
        return a + b;
    }
    public static void main(String[] args) {
        // Call the method
        Method1();
        // Call the method with parameters
        Method2(5, 10);
        // Call the method with return value
        int result = Method3(5, 10);
        System.out.println("Result: " + result);
    }    
}
