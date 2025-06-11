package Practices.Others.DataStructure;
import java.util.Scanner;
import java.util.LinkedList;

public class PLinkedList2 {
    private LinkedList<String> DailyTasks;

    public PLinkedList2() {
        DailyTasks = new LinkedList<>();
    }
    public void addTasks(Scanner input) {
        System.out.println("Enter task name: ");
        String task = input.nextLine();
        System.out.println("Do you want to insert at a specific position? (yes/no): ");
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter index (Starting from 0): ");
            int position = input.nextInt();
            if (position < 0 || position > DailyTasks.size()) {
                System.out.println("Invalid position.");
                return;
            }
            DailyTasks.add(position, task);
            System.out.println("Task added at position " + position + ".");
        } else if (choice.equalsIgnoreCase("no")) {
            DailyTasks.add(task);
            System.out.println("Task added at the end.");
        } else {
            System.out.println("Invalid input.");
        }
    }

    public void removeTasks(Scanner input) {
        System.out.println("Remove by name or position? (name/position): ");
        String choice = input.nextLine();
        if (choice.equalsIgnoreCase("name")) {
            System.out.println("Enter task name to remove: ");
            String task = input.nextLine();
            if (DailyTasks.remove(task)) {
                System.out.println("Task removed.");
            } else {
                System.out.println("Task not found.");
            }
        } else if (choice.equalsIgnoreCase("position")) {
            System.out.println("Enter index (Starting from 0): ");
            int position = input.nextInt();
            input.nextLine();
            DailyTasks.remove(position);
        } else {
            System.out.println("Invalid input.");
        }
    }

    public void checkTasks(Scanner input) {
        System.out.println("Enter task to check: ");
        String task = input.nextLine();
        boolean found = false;
        for (String t : DailyTasks) {
            if (t.equalsIgnoreCase(task)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Task found in the list.");
        } else {
            System.out.println("Task not found in the list.");
        }
    }      

    public void showTasks() {
        System.out.println("Current tasks:");
        for (String task : DailyTasks) {
            System.out.println("- " + task);
        }
    }
    public static void main(String[] args) {
        PLinkedList2 pLinkedList2 = new PLinkedList2();
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Welcome to the Advanced Task List!");
            System.out.println("Enter your choice:");
            System.out.println("1. Add a task");
            System.out.println("2. Remove tasks");
            System.out.println("3. Check if task exists");
            System.out.println("4. Show all tasks");
            System.out.println("5. Exit");
            int choice = Integer.parseInt(input.nextLine());
            switch(choice){
                case 1 -> pLinkedList2.addTasks(input);
                case 2 -> pLinkedList2.removeTasks(input);
                case 3 -> pLinkedList2.checkTasks(input);
                case 4 -> pLinkedList2.showTasks();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid input.");
            }
        }
    }
}
