import java.util.Scanner;

class GameCharacter {
    private String name;
    private int health;
    private int attackPower;
    
    // Constructor
    public GameCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }
    
    // Attack method
    public void attack(GameCharacter enemy) {
        System.out.println(name + " attacked " + enemy.name + " and reduced health by " + attackPower);
        enemy.health -= attackPower;
        
        if (enemy.health < 0) enemy.health = 0;
        
        System.out.println(enemy.name + " now has " + enemy.health + " HP\n");
    }
    
    // Heal method
    public void heal() {
        int healAmount = 20;
        health += healAmount;
        System.out.println(name + " healed themselves by " + healAmount + " HP!");
        System.out.println(name + " now has " + health + " HP\n");
    }
    
    // Show stats
    public void showStats() {
        System.out.println("=== Character Stats ===");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("=======================\n");
    }
    
    // Check if character is alive
    public boolean isAlive() {
        return health > 0;
    }
    
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== MINI GAME CHARACTER SYSTEM ===\n");
        
        // Create characters
        System.out.print("Enter first character name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter health for " + name1 + ": ");
        int health1 = sc.nextInt();
        System.out.print("Enter attack power for " + name1 + ": ");
        int power1 = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        System.out.print("\nEnter second character name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter health for " + name2 + ": ");
        int health2 = sc.nextInt();
        System.out.print("Enter attack power for " + name2 + ": ");
        int power2 = sc.nextInt();
        
        GameCharacter hero = new GameCharacter(name1, health1, power1);
        GameCharacter enemy = new GameCharacter(name2, health2, power2);
        
        System.out.println("\n=== BATTLE BEGINS! ===\n");
        hero.showStats();
        enemy.showStats();
        
        int turn = 1;
        while (hero.isAlive() && enemy.isAlive()) {
            System.out.println("--- Turn " + turn + " ---");
            
            // Hero attacks enemy
            hero.attack(enemy);
            if (!enemy.isAlive()) {
                System.out.println(enemy.getName() + " has been defeated! " + hero.getName() + " wins!\n");
                break;
            }
            
            // Enemy attacks hero
            enemy.attack(hero);
            if (!hero.isAlive()) {
                System.out.println(hero.getName() + " has been defeated! " + enemy.getName() + " wins!\n");
                break;
            }
            
            turn++;
        }
        
        System.out.println("=== GAME OVER ===");
        hero.showStats();
        enemy.showStats();
        
        sc.close();
    }
}
