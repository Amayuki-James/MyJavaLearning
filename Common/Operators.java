package Common;

public class Operators {
    public static void main(String [] args){
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Assignment Operators
        System.out.println("Assignment: " + (a = b));
        System.out.println("Addition Assignment: " + (a += b));
        System.out.println("Subtraction Assignment: " + (a -= b));
        System.out.println("Multiplication Assignment: " + (a *= b));
        System.out.println("Division Assignment: " + (a /= b));
        System.out.println("Modulus Assignment: " + (a %= b));
        System.out.println("Bitwise AND Assignment: " + (a &= b));
        System.out.println("Bitwise OR Assignment: " + (a |= b));
        System.out.println("Bitwise XOR Assignment: " + (a ^= b));
        System.out.println("Left Shift Assignment: " + (a <<= 2));
        System.out.println("Right Shift Assignment: " + (a >>= 2));
        System.out.println("Unsigned Right Shift Assignment: " + (a >>>= 2));
        System.out.println("Increment: " + (++a));
        System.out.println("Decrement: " + (--a));

    }
}
