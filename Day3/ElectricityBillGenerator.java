package java_ignite_Day3;
import java.util.Scanner;

public class ElectricityBillGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Electricity Bill Generator ===\n");
        
        // Display Menu
        System.out.println("Select Connection Type:");
        System.out.println("1. Domestic");
        System.out.println("2. Commercial");
        System.out.println("3. Industrial");
        System.out.print("Enter your choice (1-3): ");
        
        int choice = sc.nextInt();
        
        // Validate menu choice using switch
        switch (choice) {
            case 1:
            case 2:
            case 3:
                // Valid choice - proceed
                System.out.print("Enter units consumed: ");
                int units = sc.nextInt();
                
                double billAmount = 0;
                
                // Process based on connection type
                switch (choice) {
                    case 1: // Domestic
                        System.out.println("\n--- Domestic Connection ---");
                        if (units <= 100) {
                            billAmount = 0;
                            System.out.println("First 100 units: Free");
                        } 
                        else if (units <= 300) {
                            billAmount = (units - 100) * 5;
                            System.out.println("First 100 units: Free");
                            System.out.println("Next " + (units - 100) + " units @ ₹5/unit");
                        } 
                        else {
                            billAmount = (200 * 5) + ((units - 300) * 8);
                            System.out.println("First 100 units: Free");
                            System.out.println("101-300 units: 200 units @ ₹5/unit = ₹" + (200 * 5));
                            System.out.println("Above 300 units: " + (units - 300) + " units @ ₹8/unit = ₹" + ((units - 300) * 8));
                        }
                        break;
                        
                    case 2: // Commercial
                        System.out.println("\n--- Commercial Connection ---");
                        if (units <= 200) {
                            billAmount = units * 10;
                            System.out.println(units + " units @ ₹10/unit = ₹" + billAmount);
                        } 
                        else {
                            billAmount = units * 15;
                            System.out.println(units + " units @ ₹15/unit = ₹" + billAmount);
                        }
                        break;
                        
                    case 3: // Industrial
                        System.out.println("\n--- Industrial Connection ---");
                        System.out.print("Is power factor good? (yes/no): ");
                        sc.nextLine(); // consume newline
                        String powerFactor = sc.nextLine();
                        
                        double rate = 20;
                        System.out.println("Base rate: ₹20/unit");
                        System.out.println("Units consumed: " + units);
                        
                        if (units > 500 && powerFactor.equalsIgnoreCase("yes")) {
                            double beforeDiscount = units * rate;
                            double discount = beforeDiscount * 0.10;
                            billAmount = beforeDiscount - discount;
                            System.out.println("Original bill: ₹" + beforeDiscount);
                            System.out.println("10% discount (Good power factor + Units > 500): -₹" + discount);
                        } 
                        else {
                            billAmount = units * rate;
                            if (units > 500) {
                                System.out.println("Note: Units > 500 but power factor not good - No discount applied");
                            }
                        }
                        break;
                }
                
                // Display final bill
                System.out.println("\n=================================");
                System.out.println("Total Bill Amount: ₹" + billAmount);
                System.out.println("=================================");
                break;
                
            default:
                // Invalid menu choice
                System.out.println("\n❌ Invalid Connection Type");
                break;
        }
        
    }
}
