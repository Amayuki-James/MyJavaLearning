package JavaClasses;
import java.util.Scanner;

public class Practice {
    int WisdomAttribute;
    int addPoints = 10;
    String Knowledge;

    static void WisdomInfo() {
        System.out.println("You learn then you gain Wisdom.");
    }

    void Learning() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter what you are learning:");
        Knowledge = sc.nextLine();
        sc.close();
        // 不關閉 Scanner，避免關閉 System.in
    }
    public static void main(String[] args) {
        Practice obj = new Practice();
        obj.Learning(); // 呼叫非 static 方法
        WisdomInfo();    // 呼叫 static 方法

        System.out.println("You are learning " + obj.Knowledge + 
            " and you have gained " + obj.addPoints + " points in Wisdom.");

        obj.WisdomAttribute = obj.WisdomAttribute + obj.addPoints;

        System.out.println("Your Wisdom Attribute is now: " + obj.WisdomAttribute);
    }
}
