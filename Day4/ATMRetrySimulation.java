import java.util.Scanner;

public class ATMRetrySimulation {
    public static void main(String[] args) {
         int CORRECT_PIN = 1234;
        Scanner scanner = new Scanner(System.in);
        
        int userPin;
        int attempts = 0;
        
        System.out.println("=== ATM PIN Verification ===\n");
        
        // do-while ensures at least one attempt
        do {
            System.out.print("Enter your 4-digit PIN: ");
            userPin = scanner.nextInt();
            attempts++;
            
            if (userPin != CORRECT_PIN) {
                System.out.println(" Incorrect PIN. Please try again.\n");
            }
        } while (userPin != CORRECT_PIN);
        
        System.out.println("\n PIN ACCEPTED! Access granted.");
        System.out.println("Successful after " + attempts + " attempts.");
        
      
    }
}
