package JavaClasses;

public class ClassAttributes {
    /* Final */int x = 5;
    int y = 10;

// Now the ClassAttributes class has two attributes: x and y.

    public static void main(String[] args) {
        ClassAttributes myObj1 = new ClassAttributes(); // Object 1
        ClassAttributes myObj2 = new ClassAttributes(); // Object 2
        System.out.println(myObj1.x);
        System.out.println(myObj2.y);
        // The main class access the attributes of the ClassAttributes class,
        // using the object instances myObj1 and myObj2.

        // modify the attributes
        myObj1.x = 20;
        myObj2.y = 30;
        System.out.println(myObj1.x);
        System.out.println(myObj2.y);
        // Output: 20, 30

        //If you don't want to modify the value of an attribute, you can use the final keyword.
        

    }
}