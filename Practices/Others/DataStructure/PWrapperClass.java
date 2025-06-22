package Practices.Others.DataStructure;
import java.util.Scanner;

public class PWrapperClass {
    public static void main(String[] args){
        System.out.println("Input int or double or string");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        if (inputString.matches("\\d+")) {
            int inputInt = Integer.parseInt(inputString);
            System.out.println("Input int: " + inputInt);
        } else if (inputString.matches("\\d+\\.\\d+")) {
            double inputDouble = Double.parseDouble(inputString);
            System.out.println("Input double: " + inputDouble);
        } else {
            System.out.println("Input string: " + inputString);
        }
        input.close();
    }
}
