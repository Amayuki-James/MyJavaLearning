package Common;

public class JavaStrings {
    public static void main(String[] args){
        String greeting = "Hello";

        //String Length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The Length of the txt string is: " + txt.length());

        //Uppercase and Lowercase
        System.out.println("Uppercase: " + greeting.toUpperCase());
        System.out.println("Lowercase: " + greeting.toLowerCase());

        //Finding a Character in a String
        String myString = "Please locate where 'locate' occurs!";
        System.out.println("Index of 'locate': " + myString.indexOf("locate"));
    }
}
