package Common;

public class Recursion {
    // Recursion is a programming technique where a function calls itself to solve a problem.
    // It is often used to solve problems that can be broken down into smaller, similar subproblems.
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result); // Output: 55
        // The sum of the first 10 natural numbers is 1 + 2 + 3 + ... + 10 = 55
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0; // Base case: when k is 0, return 0
        }
    }
}
