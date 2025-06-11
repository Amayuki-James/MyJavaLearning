package Practices.RPGSystem;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;


class FileHandling {
    public void FileMenu() {
        System.out.println("Here is the save system: ");
        System.out.println("1. Save Game, 2. Load Game, 3. Delete current save, 4. Exit Game");
        System.out.println("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int Choice_For_File = scanner.nextInt();
        scanner.nextLine();

        switch (Choice_For_File) {
            case 1 -> Save.SaveGame();
            case 2 -> Load.LoadGame();
            case 3 -> System.out.println("DeleteSave not yet implemented.");
            case 4 -> System.exit(0);
            default -> System.out.println("Invalid choice. Please enter a valid option.");
        }
    }
}
