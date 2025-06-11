package Practices.RPGSystemAnswer;

abstract class Character {
    public String name;
    public int MaxHP;
    public int CurrentHP;
    public int moveSpeed;
    public int MagicPenetration;
    public int level;
    public float experience;
    public boolean isAlive;
    public boolean ManaZeroChecker = false;

    abstract void attack();
    abstract void rest();
    abstract void LevelUp();
    abstract void HPCheck();

    public void showStatus() {
        System.out.println("Character Name: " + name);
        System.out.println("HP: " + CurrentHP + "/" + MaxHP);
        System.out.println("Move Speed: " + moveSpeed);
        System.out.println("Magic Penetration: " + MagicPenetration);
        System.out.println("Level: " + level);
        System.out.println("Is Alive: " + isAlive);
    }
}

class Warrior extends Character {
    public int strength;
    public float critChance;
    public float atkResult;

    public void attack() {
        atkResult = strength * (1 + critChance);
        System.out.println(name + " swings sword with strength " + atkResult);
    }

    public void rest() {
        if (isAlive) {
            CurrentHP += 10;
            HPCheck();
            System.out.println(name + " rests and regains 10 HP. Current HP: " + CurrentHP);
        } else {
            System.out.println(name + " cannot rest because they are dead.");
        }
    }

    public void showStatus() {
        super.showStatus();
        System.out.println("Strength: " + strength);
        System.out.println("Critical Chance: " + critChance);
    }

    public void LevelUp() {
        if (experience >= 100) {
            level++;
            MaxHP += 50;
            moveSpeed += 2;
            MagicPenetration += 1;
            strength += 5;
            experience = 0;
            System.out.println(name + " leveled up to level " + level + "!");
        } else {
            System.out.println(name + " does not have enough experience to level up.");
        }
    }

    public void HPCheck() {
        if (CurrentHP > MaxHP) {
            CurrentHP = MaxHP;
        }
    }
}

class Mage extends Character {
    public int MaxMP;
    public int CurrentMP;
    public int spellPower;
    public int spellType;

    public void attack() {
        if (CurrentMP > 0) {
            switch (spellType) {
                case 1 -> spellPower += 10;
                case 2 -> moveSpeed += 5;
                case 3 -> MagicPenetration += 3;
                default -> {
                    isAlive = false;
                    System.out.println(name + " used an unknown spell type and died!");
                    return;
                }
            }
            System.out.println(name + " casts a spell with MP: " + CurrentMP + " Dealing " + spellPower + " damage.");
            CurrentMP--;
        } else if (!ManaZeroChecker) {
            ManaZeroChecker = true;
            System.out.println(name + " has no MP left to cast a spell.");
            System.out.println(name + " will die if they try to cast again with 0 MP.");
        } else {
            isAlive = false;
            System.out.println(name + " cast spell with 0 MP and died.");
        }
    }

    public void rest() {
        if (isAlive) {
            CurrentHP += 5;
            CurrentMP += 10;
            HPCheck();
            System.out.println(name + " rests and regains 5 HP. Current HP: " + CurrentHP);
            System.out.println(name + " regains 10 MP. Current MP: " + CurrentMP);
        } else {
            System.out.println(name + " cannot rest because they are dead.");
        }
    }

    public void showStatus() {
        super.showStatus();
        System.out.println("MP: " + CurrentMP + "/" + MaxMP);
        System.out.println("Spell Power: " + spellPower);
        System.out.println("Spell Type: " + spellType);
    }

    public void LevelUp() {
        if (experience >= 100) {
            level++;
            MaxHP += 15;
            moveSpeed += 1;
            MagicPenetration += 2;
            MaxMP += 10;
            experience = 0;
            System.out.println(name + " leveled up to level " + level + "!");
        } else {
            System.out.println(name + " does not have enough experience to level up.");
        }
    }

    public void HPCheck() {
        if (CurrentHP > MaxHP) {
            CurrentHP = MaxHP;
        }
    }
}

class Archer extends Character {
    public int agility;
    public int dexterity;
    public int arrowCount;
    public float atkResult;

    public void attack() {
        if (arrowCount <= 0) {
            System.out.println(name + " has no arrows left to shoot.");
        } else {
            atkResult = agility * 1.5f;
            System.out.println(name + " shoots an arrow dealing " + atkResult + " damage.");
            arrowCount--;
        }
    }

    public void rest() {
        if (isAlive) {
            CurrentHP += 8;
            arrowCount += 5;
            HPCheck();
            System.out.println(name + " rests and regains 8 HP. Current HP: " + CurrentHP);
            System.out.println(name + " regains 5 arrows. Arrow count: " + arrowCount);
        } else {
            System.out.println(name + " cannot rest because they are dead.");
        }
    }

    public void dodge() {
        if (isAlive) {
            System.out.println(name + " tries to dodge with dexterity " + dexterity);
            if (Math.random() * 100 < dexterity) {
                System.out.println(name + " successfully dodged the attack!");
            } else {
                System.out.println(name + " failed to dodge.");
            }
        } else {
            System.out.println(name + " is dead and cannot dodge.");
        }
    }

    public void showStatus() {
        super.showStatus();
        System.out.println("Agility: " + agility);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Arrow Count: " + arrowCount);
    }

    public void LevelUp() {
        if (experience >= 100) {
            level++;
            MaxHP += 20;
            moveSpeed += 3;
            MagicPenetration += 1;
            agility += 5;
            dexterity += 3;
            arrowCount += 10;
            experience = 0;
            System.out.println(name + " leveled up to level " + level + "!");
        } else {
            System.out.println(name + " does not have enough experience to level up.");
        }
    }

    public void HPCheck() {
        if (CurrentHP > MaxHP) {
            CurrentHP = MaxHP;
        }
    }
}

