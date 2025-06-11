package Common;

public class MethodsPara {
    static void method1(String fname) {
        System.out.println("Jason " + fname);
    }
    static void method2(String name, int age, boolean isStudent) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is Student: " + isStudent);
    }
    static void method3(int ageVerify){
        if (ageVerify < 20) {
            System.out.println("No alchol for you, your too young.");
        } else if (ageVerify >= 20 && ageVerify < 30) {
            System.out.println("You can drink alchol, but be careful.");
        } else {
            System.out.println("You can drink alchol, but be responsible.");
        }
    }
    public static void main(String[] args){
        method1("lok");
        method1("chan");
        method1("che");

        method2("James", 25, true);
        method2("John", 30, false);
        method2("Alice", 22, true);

        method3(18);
        method3(25);
        method3(35);
        method3(15);
    }
}
