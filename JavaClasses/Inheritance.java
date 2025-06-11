package JavaClasses;

public class Inheritance {
    // In Java, it is possible to inherit attributes and methods from one class to another.
    // We group the "inheritance concept" into two categories:
    // subclass (child class) - the class that inherits from another class
    // superclass (parent class) - the class being inherited from
    static class OperatingSystem {
        protected String brand = "Windows 10";
        public void displayBrand() {
            System.out.println("Operating System Brand: " + brand);
        }
    }
    
    static class Software extends OperatingSystem {
        private String RunsOnPlatform = "Windows 10";
        public static void main(String[] args) {
            Software myPC = new Software();
            myPC.displayBrand(); //
            if (myPC.brand == myPC.RunsOnPlatform) {
                System.out.println("Software is compatible with the operating system.");
            } else {
                System.out.println("Software is not compatible with the operating system.");
            }
        }
    }
    // In the above example, the Software class inherits from the OperatingSystem class.
    // The Software class can access the brand attribute and displayBrand method from the OperatingSystem class.
}
