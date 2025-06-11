package Common;

import java.util.Scanner;

public class MethodReturnValueAnswer {
    static int evaluateResidency(int liveUK, int ILR) {
        if (liveUK < 0 || (ILR != 0 && ILR != 1)) {
            return -1; // invalid input
        }
        if (liveUK == 0) {
            return 0;
        } else if (liveUK >= 5 && ILR == 1) {
            return 1;
        } else if (liveUK >= 1 && ILR == 0) {
            return 2;
        } else {
            return -1; // fallback
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of years you have lived in the UK:");
        int a = sc.nextInt();
        System.out.println("Do you have ILR? (1 for Yes, 0 for No):");
        int b = sc.nextInt();

        int result = evaluateResidency(a, b);

        switch (result) {
            case 0 -> System.out.println("Welcome to the UK");
            case 1 -> System.out.println("Welcome home, you are a British citizen.");
            case 2 -> System.out.println("You are a resident of the UK.");
            default -> System.out.println("Invalid input. Please enter valid years and ILR status.");
        }

        sc.close(); // 記得關掉 Scanner
    }
}
