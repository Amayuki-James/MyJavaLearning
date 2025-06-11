package JavaClasses;

public class ConstructorPara {
    int modelYear;
    String modelName;

    public ConstructorPara(int year, String name){
        modelYear = year; // Set the initial value of modelYear
        modelName = name; // Set the initial value of modelName
    }

    public static void main(String[] args){
        ConstructorPara myCar = new ConstructorPara(2020, "Ford Mustang"); // Create an object of class Constructor
        System.out.println(myCar.modelYear + " " + myCar.modelName); // Print the values of modelYear and modelName
    }
}
