package JavaClasses;

// An enum is a special type of class that represents a group of constants.(unchangeable variables)
// To create an enim, use the enum keyword, and seperate the constants with a comma

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Enums {
    public static void main(String[] args) {
        // You can access enum constanrts with the dot syntax, like below:
        Level myVar = Level.LOW;
        System.out.println(myVar);

    }
}
