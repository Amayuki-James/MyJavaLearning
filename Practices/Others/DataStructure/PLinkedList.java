package Practices.Others.DataStructure;

import java.util.LinkedList;
import java.util.Scanner;

public class PLinkedList {
    private LinkedList<String> DailyTasks;

    public PLinkedList() {
        DailyTasks = new LinkedList<>();
    }

    public void addTask(Scanner input) {
        System.out.println("Enter new task: ");
        String task = input.nextLine();
        System.out.println("Put task at First or Last: ");
        String headTail = input.nextLine();

        if (headTail.equalsIgnoreCase("First")) {
            DailyTasks.addFirst(task);
        } else if (headTail.equalsIgnoreCase("Last")) {
            DailyTasks.addLast(task);
        } else {
            System.out.println("Invalid input.");
        }
    }

    public void removeTask(Scanner input) {
        if (DailyTasks.isEmpty()) {
            System.out.println("No tasks to remove.");
            return;
        }

        System.out.println("Remove task at First or Last: ");
        String headTail = input.nextLine();

        if (headTail.equalsIgnoreCase("First")) {
            DailyTasks.removeFirst();
        } else if (headTail.equalsIgnoreCase("Last")) {
            DailyTasks.removeLast();
        } else {
            System.out.println("Invalid input.");
        }
    }

    public void printTask() {
        if (DailyTasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("Current tasks:");
            for (String task : DailyTasks) {
                System.out.println("- " + task);
            }
        }
    }

    public static void main(String[] args) {
        PLinkedList pLinkedList = new PLinkedList();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter your choice: 1. Print, 2. Remove, 3. Add, 4. Exit");
            String choice = input.nextLine();

            switch (choice) {
                case "1" -> pLinkedList.printTask();
                case "2" -> pLinkedList.removeTask(input);
                case "3" -> pLinkedList.addTask(input);
                case "4" -> {
                    System.out.println("Goodbye!");
                    input.close();
                    return;
                }
                default -> System.out.println("Invalid input. Please choose 1-4.");
            }
        }
    }
}

