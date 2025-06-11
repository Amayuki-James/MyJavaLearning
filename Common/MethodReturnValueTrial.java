package Common;

import java.util.Scanner;

public class MethodReturnValueTrial {
    static int method1(int liveUK, int ILR) {
        if (liveUK == 0) {
            return 0;
        } else if (liveUK >= 5 && ILR == 1) {
            return 1;
        } else if (liveUK >= 1 && ILR == 0) {
            return 2;
        } else {
            return -1; // Invalid input
        }
    }
    public static void main(String[] args){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of years you have lived in the UK:");
        a = sc.nextInt();
        System.out.println("Do you have ILR? (1 for Yes, 0 for No):");
        b = sc.nextInt();
        int result = method1(a, b);

        if (result == 0) {
            System.out.println("Welcome to the UK");
        } else if (result == 1) {
            System.out.println("Welcome home, you are a British citizen.");
        } else if (result == 2) {
            System.out.println("You are a resident of the UK.");
        } else {
            System.out.println("Invalid input. Please enter valid years and ILR status.");
        }
        sc.close();
    }
}

