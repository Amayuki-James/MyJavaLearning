package Practices.RPGSystemAnswer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the RPG System!");
        System.out.println("Please choose a character type:");
        System.out.println("1. Warrior, 2. Mage, 3. Archer, 0. Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        Warrior warrior = null;
        Mage mage = null;
        Archer archer = null;

        switch (choice) {
            case 0 -> {
                System.out.println("You chose Exit!");
                return;
            }
            case 1 -> {
                System.out.println("You chose Warrior! Input your character name:");
                String name = scanner.nextLine();
                warrior = new Warrior();
                warrior.name = name;
                warrior.MaxHP = 100;
                warrior.CurrentHP = 100;
                warrior.moveSpeed = 5;
                warrior.MagicPenetration = 0;
                warrior.level = 1;
                warrior.experience = 120; // 測試升級
                warrior.isAlive = true;
                warrior.strength = 20;
                warrior.critChance = (float) Math.random();
            }
            case 2 -> {
                System.out.println("You chose Mage! Input your character name:");
                String name = scanner.nextLine();
                mage = new Mage();
                mage.name = name;
                mage.MaxHP = 80;
                mage.CurrentHP = 80;
                mage.moveSpeed = 4;
                mage.MagicPenetration = 5;
                mage.level = 1;
                mage.experience = 110;
                mage.isAlive = true;
                mage.MaxMP = 10;
                mage.CurrentMP = 10;
                mage.spellPower = 15;
                mage.spellType = (int) (Math.random() * 3) + 1;
            }
            case 3 -> {
                System.out.println("You chose Archer! Input your character name:");
                String name = scanner.nextLine();
                archer = new Archer();
                archer.name = name;
                archer.MaxHP = 90;
                archer.CurrentHP = 90;
                archer.moveSpeed = 6;
                archer.MagicPenetration = 2;
                archer.level = 1;
                archer.experience = 150;
                archer.isAlive = true;
                archer.agility = 25;
                archer.dexterity = (int) (Math.random() * 100); // now valid
                archer.arrowCount = 10;
            }
            default -> System.out.println("Invalid choice, please try again.");
        }

        if (warrior != null) {
            warrior.showStatus();
            warrior.attack();
            warrior.rest();
            warrior.LevelUp();
        } else if (mage != null) {
            mage.showStatus();
            mage.attack();
            mage.rest();
            mage.LevelUp();
        } else if (archer != null) {
            archer.showStatus();
            archer.attack();
            archer.rest();
            archer.LevelUp();
        } else {
            System.out.println("No character was created.");
        }
    }
}
