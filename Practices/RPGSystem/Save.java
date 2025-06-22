package Practices.RPGSystem;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Save {
    public static void SaveGame(Character player) {
        File file = new File("H:/Learning/Programming/Java/Practices/RPGSystem/save.txt");
        Scanner scanner = new Scanner(System.in);

        try {
            if (!file.exists()) file.createNewFile();

            System.out.println("Please choose a slot to save your game (1-3):");
            int slot = scanner.nextInt();
            scanner.nextLine();
            if (slot < 1 || slot > 3) {
                System.out.println("Invalid slot number.");
                return;
            }

            String[] slots = new String[]{"", "", ""};
            Scanner fileScanner = new Scanner(file);
            int index = 0;
            while (fileScanner.hasNextLine() && index < 3) {
                slots[index] = fileScanner.nextLine();
                index++;
            }
            fileScanner.close();

            String serialized = "";
            if (player instanceof Warrior) serialized = ((Warrior) player).serialize();
            else if (player instanceof Mage) serialized = ((Mage) player).serialize();
            else if (player instanceof Archer) serialized = ((Archer) player).serialize();
            else throw new IllegalArgumentException("Unsupported character class");

            slots[slot - 1] = serialized;

            FileWriter writer = new FileWriter(file);
            for (String s : slots) writer.write(s + "\n");
            writer.close();

            System.out.println("Game saved to slot " + slot + ".");

        } catch (IOException e) {
            System.out.println("An error occurred while saving the game.");
            e.printStackTrace();
        }
    }
}   