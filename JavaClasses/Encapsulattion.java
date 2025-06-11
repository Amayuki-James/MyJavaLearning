package JavaClasses;

public class Encapsulattion {
    private String name; // private = restricted access

    // Getter method for name
    public String getName() {
        return name;
    }
    // The get method is used to access the value of the private variable
    // It allows controlled access to the variable from outside the class.

    //Setter method for name
    public void setName(String newName) {
        this.name = newName;
    }
    //
}
