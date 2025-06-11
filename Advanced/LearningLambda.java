package Advanced;
import java.util.ArrayList;
import java.util.function.Consumer;

// Lambda Expressions were added in java 8.
// A lambda expression is a short block of code which takes in parameters and returns a value.
// Lambda expressions are similar to methods, but they do not need a name and they can be 
// implemented right in the body of a method.
/* Syntax:
 * parameters -> expression
 * (para1, para2) -> expression
 * (para1, para2) -> { return expression; }
 */

public class LearningLambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.forEach( (n) -> {System.out.println(n); } );
        
        Consumer<Integer> method = (n) -> {System.out.println(n); };
        numbers.forEach(method);
    }
}
