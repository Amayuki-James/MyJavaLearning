package Advanced;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Regular expression can be a single character, or a more complicated pattern.
// Java does not have a built-in Regular Expression class, 
// but we can import the java.util.regex package to work with Regular Expressions.
// That includes:
// 1. Pattern class: Used to create a regular expression pattern.
// 2. Matcher class: Used to match a regular expression pattern against a string.
// 3. PatternSyntaxException class: Used to handle errors in regular expression patterns.

public class RegularExpression {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools.com!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found.");
        } else {
            System.out.println("Match not found.");
        }
        /* The word "w3schools" is being searched for in a sentence.
         * First, the pattern is created using the Pattern.compile() method.
         * The first parameter indicates which pattern is being searched for and the second parameter
         * has a flag to indicateds that the search should be case-insensitive.
         * 
         * Next, the matcher() method is used to search for the pattern in a string.
         * It returns a Matcher object which contains info about the search that was performed.
         * 
         * Then, the find() method returns true if the pattern was found in the string 
         * and false if it was not found.
        */ 

        /* Here are some other flags that can be used with Pattern.compile():
         * Pattern.CASE_INSENSITIVE is a flag that indicates that the search should be case-insensitive.
         * Pattern.LITERAL is a flag that indicates that the pattern should be treated as a literal string.
         * Pattern.MULTILINE is a flag that indicates that the pattern should match across multiple lines.
         * Pattern.COMMENTS is a flag that indicates that the pattern should ignore comments in the string.
         * Pattern.UNICODE_CASE is a flag that indicates that the pattern should match Unicode case.
         */
    }
}