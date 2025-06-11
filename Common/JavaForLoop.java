package Common;

public class JavaForLoop {
    public static void main(String[] args){
        // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Value of i: " + i);
        }

        //Nested For Loop
        //The inner loop will be executed for each iteration of the outer loop
        //outer loop
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop iteration: " + i);
            //inner loop
            for (int j = 0; j < 2; j++) {
                System.out.println("Inner loop iteration: " + j);
            }
        }
    }
    
}
