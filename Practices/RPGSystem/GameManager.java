package Practices.RPGSystem;
import java.util.Scanner;

class GameManager {
    private Character player;
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to the RPG!");
        player = createCharacter();

        while (true) {
            showMenu();
            int choice = getUserChoice();
            handleChoice(choice);
        }
    }

    private Character createCharacter() {
        CharCreation creation = new CharCreation();
        return creation.getCharacter();
    }

    private void showMenu() {
        System.out.println("=== Main Menu ===");
        System.out.println("1. Show Status");
        System.out.println("2. Attack");
        System.out.println("3. Rest");
        System.out.println("4. Save Game");
        System.out.println("0. Exit");
    }

    private int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1 -> player.showStatus();
            case 2 -> player.attack();
            case 3 -> player.rest();
            case 4 -> Save.SaveGame(player);
            case 0 -> {
                System.out.println("Thanks for playing!");
                System.exit(0);
            }
            default -> System.out.println("Invalid choice.");
        }
    }
}