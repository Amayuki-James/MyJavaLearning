package JavaClasses;

class ModAbstractSecond {
    public static void main(String[] args) {
        //create an object of the Student class
        Student myObj = new Student();
        // Call the abstract method
        myObj.study(); // Output: Studying all day long
        // Accessing properties from the abstract class
        System.out.println("Name: " + myObj.fname); // Output: Name: James
        System.out.println("Age: " + myObj.age); // Output: Age: 25
        System.out.println("Graduation Year: " + myObj.graduationYear); // Output: Graduation Year: 2018
        myObj.study(); // Output: Studying all day long
    }
    
}
