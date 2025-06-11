package Practices.Others.DataStructure;
import java.util.ArrayList;
import java.util.Scanner;

public class PArrayList {
    public static void main(String[] args){
        ArrayList<String> Animes = new ArrayList<String>();
        System.out.println("Enter 5 of your favorite animes one at a time: ");
        Scanner input = new Scanner(System.in);
        String AnimeName = input.nextLine();
        Animes.add(AnimeName);
        AnimeName = input.nextLine();
        Animes.add(AnimeName);
        AnimeName = input.nextLine();
        Animes.add(AnimeName);
        AnimeName = input.nextLine();
        Animes.add(AnimeName);
        AnimeName = input.nextLine();
        Animes.add(AnimeName);
        System.out.println("Your favorite animes are: " + Animes);
        int RCount = Animes.size();
        Animes.remove((int)(Math.random() * RCount));
        // Make (Math.random() * RCount) as double then turn it to int using (int)
        System.out.println("Your favorite animes are: " + Animes);
        input.close();
    }
}
