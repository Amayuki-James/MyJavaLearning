package Common;

public class identifiers {
    public static void main(String[] args) {
        // Valid identifiers
        int a = 5;
        int _b = 10;
        int $c = 15;
        int d1 = 20;

        // Invalid identifiers
        // int 1d = 25; // Cannot start with a digit
        // int d@ = 30; // Special characters other than _ and $ are not allowed

        System.out.println("Valid identifiers:");
        System.out.println("a: " + a);
        System.out.println("_b: " + _b);
        System.out.println("$c: " + $c);
        System.out.println("d1: " + d1);
    }
}
