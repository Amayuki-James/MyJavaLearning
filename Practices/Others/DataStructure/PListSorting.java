package Practices.Others.DataStructure;
import java.util.ArrayList;
import java.util.Collections;

public class PListSorting {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int)(Math.random() * 100);
            numbers.add(randomNumber);
        }
        Collections.sort(numbers);
        for (Integer i : numbers) {
            System.out.println(i);
        }
        Collections.sort(numbers, Collections.reverseOrder());
        for (Integer i : numbers) {
            System.out.println(i);
        }
    }
}
