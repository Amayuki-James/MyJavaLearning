package JavaClasses;

public class ModStatic {
    // Static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating an instance of the class.");
    }

    // Public method
    public void myPublicMethod(){
        System.out.println("Public methods can be called by creating an instance of the class.");
    }

    // Main method
    public static void main(String[] args){
        myStaticMethod(); // Call the static method without creating an instance
        // myPublicMethod(); // This line would cause an error if uncommented, as it requires an instance of ModStatic
        ModStatic myObj = new ModStatic(); // Create an instance of ModStatic
        myObj.myPublicMethod(); // Call the public method using the instance
        // Note: Static methods can be called directly using the class name as well
    }

}
