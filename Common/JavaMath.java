package Common;

public class JavaMath {
    public static void main(String[] args){
        //Math methods are static methods of the java.lang.Math class

        //Math.max(x,y) returns the greater of two values
        Math.max(5, 10); // returns 10

        //Math.min(x,y) returns the smaller of two values
        Math.min(5, 10); // returns 5

        //Math.sqrt(x) returns the square root of x
        Math.sqrt(16); // returns 4.0

        //Math.abs(x) returns the absolute value of x
        Math.abs(-5); // returns 5
        Math.abs(5); // returns 5

        
        
        //Random Numbers
        int randomNum = (int)(Math.random() * 101); // returns a random number between 0 and 100
        System.out.println("Random Number: " + randomNum);


    }
}