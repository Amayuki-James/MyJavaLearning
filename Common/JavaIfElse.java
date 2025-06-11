package Common;

public class JavaIfElse {

    public static void main(String[] args) {
        // If statement
        if (5 > 3) {
            System.out.println("Five is greater than three");
        }

        // If-else statement
        if (5 < 3) {
            System.out.println("Five is less than three");
        } else {
            System.out.println("Five is not less than three");
        }
        
        // Else-if statement
        if (5 < 3) {
            System.out.println("Five is less than three");
        } else if (5 == 3) {
            System.out.println("Five is equal to three");
        } else {
            System.out.println("Five is greater than three");
        }

        //Short-hand if else
        int time = 20;
        if (time < 18){
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        //Can change into
        int time2 = 20;
        String result = (time2 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        }
    }

