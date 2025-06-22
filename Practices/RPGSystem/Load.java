package Practices.RPGSystem;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Load {
    public static Character LoadGame() {
        try {
            File file = new File("H:/Learning/Programming/Java/Practices/RPGSystem/save.txt");
            if (!file.exists()) {
                System.out.println("Save file not found.");
                return null;
            }

            Scanner sc = new Scanner(System.in);
            System.out.println("Which slot do you want to load? (1-3): ");
            int slot = sc.nextInt();

            Scanner reader = new Scanner(file);
            int currentLine = 1;

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (currentLine == slot) {
                    if (line.startsWith("Warrior")) {
                        return Warrior.deserialize(line);
                    } else if (line.startsWith("Mage")) {
                        return Mage.deserialize(line);
                    } else if (line.startsWith("Archer")) {
                        return Archer.deserialize(line);
                    } else {
                        System.out.println("Unrecognized character type.");
                        return null;
                    }
                }
                currentLine++;
            }

            System.out.println("Slot is empty or not found.");
            reader.close();
        } catch (Exception e) {
            System.out.println("Error loading game: " + e.getMessage());
        }
        return null;
    }
}

