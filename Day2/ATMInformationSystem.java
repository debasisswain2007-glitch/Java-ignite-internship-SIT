package java_ignite_day2;
import java.util.Scanner;

public class ATMInformationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter account holder name: ");
        String holderName = input.nextLine();
        
        System.out.print("Enter account balance: ");
        double balance = input.nextDouble();
        
        System.out.print("Enter withdrawal amount: ");
        double withdrawal = input.nextDouble();
        
        System.out.println("\n--- ATM Transaction ---");
        System.out.println("Account Holder: " + holderName);
        System.out.println("Current Balance: " + balance);
        System.out.println("Withdrawal Amount: " + withdrawal);
        
        // Bonus: comparison check
        if (balance > withdrawal) {
            double remaining = balance - withdrawal;
            System.out.println("Remaining Balance: " + remaining);
        } else {
            System.out.println("Insufficient balance! Cannot withdraw.");
        }
    }
}