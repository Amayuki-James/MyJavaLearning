package JavaClasses;

// A package in Java is used to group related classes. Think of it as a folder in a file directory.
// We use packages to avoid name conflicts, and to write a better maintainable code.
// Packages are divided into two categories:
// 1. Built-in packages: These are the packages that come with Java, such as java.lang, java.util, etc.
// 2. User-defined packages: These are the packages that we create ourselves to organize our classes.
// For Example:
import java.util.Scanner; // Importing the Scanner class from the java.util package
// The Scanner class is used to get user input in Java.

class PackagesAPI {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = myObj.nextLine(); // Reading user input
        System.out.println("Username is: " + userName);
        myObj.close(); // Closing the scanner to prevent resource leaks
    }    
   
}

