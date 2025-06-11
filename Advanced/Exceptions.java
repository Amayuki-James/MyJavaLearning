package Advanced;

// When executing Java code, different errors can occur:
// coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.
// These errors are called exceptions.

// try: the try statement allows you to define a block of code to be tested for errors.
// catch: the catch statement allows you to define a block of code to be executed, 
//        if an error occurs in the try block.

public class Exceptions {
    public static void main(String[] args){
        try {
            int[] myNum = {1, 2, 3};
            System.out.println(myNum[10]); // Output: ArrayIndexOutOfBoundsException\
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred");
            System.out.println(e);
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
