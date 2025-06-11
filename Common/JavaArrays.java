package Common;

public class JavaArrays {
    public static void main(String[] args) {
        //Examples of declaring arrays
        String[] cars;
        String[] sports = {"basketball", "soccer", "tennis"};
        int[] numbers = new int[5];

        //Access the Elements of an array
        String[] fruits = {"apple", "banana", "cherry"};
        System.out.println(fruits[0]); // Output: apple

        //Change the value of an array element'
        fruits[1] = "orange";
        System.out.println(fruits[1]); // Output: orange
        
        //Looping through an array
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        //Array Length
        String[] vegetables = {"carrot", "broccoli", "spinach"};
        System.out.println("Length of vegetables array: " + vegetables.length); // Output: 3
        
        //Multidimensional Arrays
        String[][] cars1 = {
            {"Toyota", "Honda", "Ford"},
            {"BMW", "Mercedes", "Audi"},
            {"Volkswagen", "Hyundai", "Nissan"}
        };
        System.out.println(cars1[1][2]); // Output: Audi

        //Array of Objects
        class Person {
            String name;
            int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }
        Person[] people = new Person[3];
        people[0] = new Person("Alice", 30);
        people[1] = new Person("Bob", 25);
        

    }
}
