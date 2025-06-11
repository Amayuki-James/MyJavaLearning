package Practices.RPGSystem;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Save {
    static String characterData = "";

    public static void SaveGame() {
        File file = new File("H:/Learning/Programming/Java/Practices/RPGSystem/save.txt");
        Scanner scanner = new Scanner(System.in);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

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

            Warrior exampleWarrior = new Warrior();
            exampleWarrior.name = "WarriorA";
            exampleWarrior.MaxHP = 100;
            exampleWarrior.CurrentHP = 90;
            exampleWarrior.moveSpeed = 5;
            exampleWarrior.MagicPenetration = 0;
            exampleWarrior.level = 1;
            exampleWarrior.experience = 10.5f;
            exampleWarrior.isAlive = true;
            exampleWarrior.strength = 20;
            exampleWarrior.critChance = 0.3f;

            characterData = exampleWarrior.serialize();
            slots[slot - 1] = characterData;

            FileWriter writer = new FileWriter(file);
            for (String s : slots) {
                writer.write(s + "\n");
            }
            writer.close();

            System.out.println("Game saved to slot " + slot + ".");

        } catch (IOException e) {
            System.out.println("An error occurred while saving the game.");
            e.printStackTrace();
        }
    }
}