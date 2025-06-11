package Common;

public class JavaTypeCasting {
    public static void main(String[] args) {
        //Widening Casting (automatically) - converting a smaller type to a larger type
        // byte to short, int, long, float, or double
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println("Widening Casting:");
        System.out.println("myInt: " + myInt);
        System.out.println("myDouble: " + myDouble);

        //Narrowing Casting (manually) - converting a larger type to a smaller type
        // double to float, long, int, short, or byte
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println("Narrowing Casting:");
        System.out.println("myDouble2: " + myDouble2);
        System.out.println("myInt2: " + myInt2);
    }
}
