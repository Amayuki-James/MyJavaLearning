package Advanced;

interface StringFunction {
    String run(String str);
}

public class LambdainMethods {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!"; // lambda expression
        StringFunction ask = (s) -> s + "?"; // lambda expression
        System.out.println(exclaim.run("Hello"));
        System.out.println(ask.run("Hello"));
        // OR
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}