package Common;

public class BreaknContinue {
    public static void main(String[] args) {
    // break statement
    // break statement can be used to jump out of a loop
    for (int i = 0; i < 10; i++) {
        if (i == 4) {
            break; // exit the loop when i is 4
        }
        System.out.println(i);
    }
    // continue statement
    // continue statement can be used to skip the current iteration of a loop
    int i = 0;
    while (i < 10) {
        i++;
        if (i == 4) {
            continue; // skip the current iteration when i is 4
        }
        System.out.println(i);
    }
    }   
}
