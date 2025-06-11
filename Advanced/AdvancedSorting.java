package Advanced;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Comparators, an object that implements the comparator interface is called a comparator.
// The comparator interface allows you to create a class with a compare() method that compares
// two objects to decide which one should go should go first in a list.

// The compare() method should return a number which is:
// Negative if the first object should go first in a list.
// Positive if the second object should go first in a list.
// Zero if the order does not matter.

// Define a Student class
class Student {
    public String name;
    public int SID;
    public int age;

    public Student(String n, int s, int a) {
        name = n;
        SID = s;
        age = a;
    }
}

// Create a comparator
class SortByYear implements Comparator {
    public int compare(Object o1, Object o2) {
        // Make sure that the objects are types of student
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if (s1.age < s2.age) {
            return -1;                      // The first student has a smaller year
        } else if (s1.age > s2.age) {
            return 1;                       // The first student has a larger year
        }
        return 0;                           // The years are the same   
    }
}
public class AdvancedSorting {
    public static void main(String[] args) {
        // Create a list of students
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("John", 1, 20));
        students.add(new Student("Jane", 2, 22));
        students.add(new Student("Jack", 3, 21));
        students.add(new Student("Jill", 4, 24));
        students.add(new Student("Joe", 5, 25));
        students.add(new Student("Judy", 6, 23));

        // Use a comparator to sort the list
        Comparator myComparator = new SortByYear();
        Collections.sort(students, myComparator);

        // Display the sorted list
        for (Student s : students) {
            System.out.println(s.name + " " + s.SID + " " + s.age);
        }
    }
}
