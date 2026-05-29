import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int number;
        
        System.out.println("=== Sum Until Negative Number ===");
        System.out.println("Enter numbers to add (enter a negative number to stop):\n");
        
        // Keep taking input until a negative number is entered
        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            
            // Check if number is negative
            if (number < 0) {
                break;  // Exit the loop
            }
            
            // Add to sum if not negative
            sum = sum + number;
        }
        
        System.out.println("\n=================================");
        System.out.println("Final Sum: " + sum);
        
        
    }
}