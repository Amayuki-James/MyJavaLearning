package Practices.RPGSystem;

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

    public void rest(){
        if (isAlive) {
            CurrentHP += 10;
            HPCheck(); // Regain 10 HP when resting
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
    public void HPCheck(){
        if (CurrentHP > MaxHP || CurrentHP == MaxHP){
            CurrentHP = MaxHP;
        } else {
            return;
        }
    }
    public String serialize() {
        return String.join(",",
            "Warrior",
            name,
            String.valueOf(MaxHP),
            String.valueOf(CurrentHP),
            String.valueOf(moveSpeed),
            String.valueOf(MagicPenetration),
            String.valueOf(level),
            String.valueOf(experience),
            String.valueOf(isAlive),
            String.valueOf(strength),
            String.valueOf(critChance)
        );
    }

    public static Warrior deserialize(String data) {
        String[] parts = data.split(",");
        if (!parts[0].equals("Warrior")) throw new IllegalArgumentException("Invalid type for Warrior");

        Warrior w = new Warrior();
        w.name = parts[1];
        w.MaxHP = Integer.parseInt(parts[2]);
        w.CurrentHP = Integer.parseInt(parts[3]);
        w.moveSpeed = Integer.parseInt(parts[4]);
        w.MagicPenetration = Integer.parseInt(parts[5]);
        w.level = Integer.parseInt(parts[6]);
        w.experience = Float.parseFloat(parts[7]);
        w.isAlive = Boolean.parseBoolean(parts[8]);
        w.strength = Integer.parseInt(parts[9]);
        w.critChance = Float.parseFloat(parts[10]);
        return w;
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
            case 1:
                spellPower = spellPower + 10; // Spell increase damage
                break;
            case 2:
                moveSpeed = moveSpeed + 5; // Spell increases speed
                break;
            case 3:
                MagicPenetration = MagicPenetration + 3; // Spell increases magic penetration
                break;
            default:
                isAlive = false; // Invalid spell type, character dies
            }
            System.out.println(name + " casts a spell with MP: " + CurrentMP + " Dealing " + spellPower + " damage.");
            CurrentMP--;
            } else if (CurrentMP == 0 && ManaZeroChecker == false) {
                ManaZeroChecker = true;
                System.out.println(name + " has no MP left to cast a spell.");
                System.out.println(name + " Character will die if they try to cast a spell again if MP is still 0.");
            } else {
                isAlive = false;
                System.out.println(name + " has no MP left to cast a spell.");
                System.out.println(name + " has died due to using all of his MP.");
            }
    }
    public void rest() {
        if (isAlive) {
            CurrentHP += 5; // Regain 5 HP when resting
            HPCheck();
            System.out.println(name + " rests and regains 5 HP. Current HP: " + CurrentHP);
            CurrentMP += 10; // Regain 10 MP when resting
            System.out.println(name + " rests and regains 10 MP. Current MP: " + CurrentMP);
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
    public void HPCheck(){
        if (CurrentHP > MaxHP || CurrentHP == MaxHP){
            CurrentHP = MaxHP;
        } else {
            return;
        }
    }
    public String serialize() {
    return String.join(",",
            "Mage",
        name,
        String.valueOf(MaxHP),
        String.valueOf(CurrentHP),
        String.valueOf(moveSpeed),
        String.valueOf(MagicPenetration),
        String.valueOf(level),
        String.valueOf(experience),
        String.valueOf(isAlive),
        String.valueOf(MaxMP),
        String.valueOf(CurrentMP),
        String.valueOf(spellPower),
        String.valueOf(spellType)
        );
    }

    public static Mage deserialize(String data) {
        String[] parts = data.split(",");
        if (!parts[0].equals("Mage")) throw new IllegalArgumentException("Invalid type for Mage");

        Mage M = new Mage();
        M.name = parts[1];
        M.MaxHP = Integer.parseInt(parts[2]);
        M.CurrentHP = Integer.parseInt(parts[3]);
        M.moveSpeed = Integer.parseInt(parts[4]);
        M.MagicPenetration = Integer.parseInt(parts[5]);
        M.level = Integer.parseInt(parts[6]);
        M.experience = Float.parseFloat(parts[7]);
        M.isAlive = Boolean.parseBoolean(parts[8]);
        M.MaxMP = Integer.parseInt(parts[9]);
        M.CurrentMP = Integer.parseInt(parts[10]);
        M.spellPower = Integer.parseInt(parts[11]);
        M.spellType = Integer.parseInt(parts[12]);
        return M;
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
            return;
        } else {
            atkResult = agility * 1.5f; // Archer's attack is based on agility
            System.out.println(name + " shoots an arrow with agility " + "dealing " + atkResult + " damage.");
            arrowCount--;
        }  
    }
    public void rest() {
        if (isAlive) {
            CurrentHP += 8; // Regain 8 HP when resting
            HPCheck();
            System.out.println(name + " rests and regains 8 HP. Current HP: " + CurrentHP);
            arrowCount += 5; // Regain 5 arrows when resting
            System.out.println(name + " rests and regains 5 arrows. Current arrow count: " + arrowCount);
        } else {
            System.out.println(name + " cannot rest because they are dead.");
        }
    
    }
    public void dodge() {
        if (isAlive) {
            System.out.println(name + " attempts to dodge an attack with dexterity " + dexterity);
            if (Math.random() > dexterity) { 
                System.out.println(name + " successfully dodged the attack!");
            } else {
                System.out.println(name + " failed to dodge the attack.");
            }
        } else {
            System.out.println(name + " cannot dodge because they are dead.");
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
            arrowCount += 10; // Increase arrow count on level up
            experience = 0;
            System.out.println(name + " leveled up to level " + level + "!");
        } else {
            System.out.println(name + " does not have enough experience to level up.");
        }
    }
    public void HPCheck(){
        if (CurrentHP > MaxHP || CurrentHP == MaxHP){
            CurrentHP = MaxHP;
        } else {
            return;
        }
    }
    public String serialize() {
    return String.join(",",
            "Archer",
        name,
        String.valueOf(MaxHP),
        String.valueOf(CurrentHP),
        String.valueOf(moveSpeed),
        String.valueOf(MagicPenetration),
        String.valueOf(level),
        String.valueOf(experience),
        String.valueOf(isAlive),
        String.valueOf(agility),
        String.valueOf(dexterity),
        String.valueOf(arrowCount)
        );
    }

    public static Archer deserialize(String data) {
        String[] parts = data.split(",");
        if (!parts[0].equals("Archer")) throw new IllegalArgumentException("Invalid type for Archer");

        Archer A = new Archer();
        A.name = parts[1];
        A.MaxHP = Integer.parseInt(parts[2]);
        A.CurrentHP = Integer.parseInt(parts[3]);
        A.moveSpeed = Integer.parseInt(parts[4]);
        A.MagicPenetration = Integer.parseInt(parts[5]);
        A.level = Integer.parseInt(parts[6]);
        A.experience = Float.parseFloat(parts[7]);
        A.isAlive = Boolean.parseBoolean(parts[8]);
        A.agility = Integer.parseInt(parts[9]);
        A.dexterity = Integer.parseInt(parts[10]);
        A.arrowCount = Integer.parseInt(parts[11]);
        return A;
    }
}




