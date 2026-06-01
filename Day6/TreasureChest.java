import java.util.Scanner;
package java_ignite_day6;

class TreasureChest {
    // Variables
    String playerName;
    int coinsCollected;
    String reward;
    
    // Constructor - decides reward based on coins collected
    TreasureChest(String playerName, int coinsCollected) {
        this.playerName = playerName;
        this.coinsCollected = coinsCollected;
        
        // Decide reward based on coin count
        if (coinsCollected >= 1000) {
            this.reward = "Diamond Sword";
        } else if (coinsCollected >= 500) {
            this.reward = "Gold Sword";
        } else if (coinsCollected >= 100) {
            this.reward = "Iron Sword";
        } else {
            this.reward = "Wooden Sword";
        }
    }
    
    // Display method to show player info and reward
    void display() {
        System.out.println("Player: " + playerName);
        System.out.println("Coins Collected: " + coinsCollected);
        System.out.println("Reward: " + reward);
    }
}

// Main class to test the game
public class TreasureChest {
    public static void main(String[] args) {
        // Test different scenarios
        System.out.println("=== Treasure Chest Game ===\n");
        
        TreasureChest player1 = new TreasureChest("Steve", 1200);
        player1.display();
        
        System.out.println("\n---\n");
        
        TreasureChest player2 = new TreasureChest("Alex", 750);
        player2.display();
        
        System.out.println("\n---\n");
        
        TreasureChest player3 = new TreasureChest("Hero", 300);
        player3.display();
        
        System.out.println("\n---\n");
        
        TreasureChest player4 = new TreasureChest("Noob", 50);
        player4.display();
    }

	}

}
