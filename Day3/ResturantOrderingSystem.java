package java_ignite_Day3;
import java.util.Scanner;

public class RestaurantOrderingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables
        String selectedItem = "";
        double price = 0.0;
        int quantity = 0;
        String memberStatus = "";
        double subtotal = 0.0;
        double discountPercentage = 0.0;
        double discountAmount = 0.0;
        double finalBill = 0.0;
        boolean validChoice = true;
        
        // Main Menu
        System.out.println("=== RESTAURANT ORDERING SYSTEM ===");
        System.out.println("Main Menu:");
        System.out.println("1. Veg");
        System.out.println("2. Non-Veg");
        System.out.print("Enter your choice (1 or 2): ");
        
        int mainChoice = scanner.nextInt();
        
        // Using switch case for main menu
        switch (mainChoice) {
            case 1: // Veg Menu
                System.out.println("\n--- Veg Menu ---");
                System.out.println("1. Fried Rice (₹150)");
                System.out.println("2. Noodles (₹120)");
                System.out.print("Select item: ");
                
                int vegChoice = scanner.nextInt();
                
                // Using switch case for veg items
                switch (vegChoice) {
                    case 1:
                        selectedItem = "Fried Rice";
                        price = 150.0;
                        break;
                    case 2:
                        selectedItem = "Noodles";
                        price = 120.0;
                        break;
                    default:
                        System.out.println("Invalid Selection");
                        validChoice = false;
                }
                break;
                
            case 2: // Non-Veg Menu
                System.out.println("\n--- Non-Veg Menu ---");
                System.out.println("1. Chicken Biryani (₹250)");
                System.out.println("2. Grill Chicken (₹300)");
                System.out.print("Select item: ");
                
                int nonVegChoice = scanner.nextInt();
                
                // Using switch case for non-veg items
                switch (nonVegChoice) {
                    case 1:
                        selectedItem = "Chicken Biryani";
                        price = 250.0;
                        break;
                    case 2:
                        selectedItem = "Grill Chicken";
                        price = 300.0;
                        break;
                    default:
                        System.out.println("Invalid Selection");
                        validChoice = false;
                }
                break;
                
            default:
                System.out.println("Invalid Selection");
                validChoice = false;
        }
        
        // If valid choice, proceed with order
        if (validChoice) {
            // Take quantity
            System.out.print("\nEnter quantity: ");
            quantity = scanner.nextInt();
            
            subtotal = price * quantity;
            
            // Take member status
            System.out.print("Enter member status (Gold/Silver/Normal): ");
            scanner.nextLine(); // consume newline
            memberStatus = scanner.nextLine();
            
            // Using if-else for discount calculation
            if (memberStatus.equalsIgnoreCase("Gold")) {
                discountPercentage = 20.0;
            } else if (memberStatus.equalsIgnoreCase("Silver")) {
                discountPercentage = 10.0;
            } else if (memberStatus.equalsIgnoreCase("Normal")) {
                discountPercentage = 0.0;
            } else {
                System.out.println("Invalid member status! Treating as Normal.");
                discountPercentage = 0.0;
            }
            
            // Calculate discount and final bill
            discountAmount = (subtotal * discountPercentage) / 100;
            finalBill = subtotal - discountAmount;
            
            // Display bill details
            System.out.println("\n===== BILL DETAILS =====");
            System.out.println("Item: " + selectedItem);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price per item: ₹" + price);
            System.out.println("Subtotal: ₹" + subtotal);
            System.out.println("Member Status: " + memberStatus);
            System.out.println("Discount: " + discountPercentage + "% (₹" + discountAmount + ")");
            System.out.println("Final Bill: ₹" + finalBill);
            
            // Extra twist: Using if-else for free dessert condition
            if (memberStatus.equalsIgnoreCase("Gold") && finalBill > 2000) {
                System.out.println("\n🎉 Congratulations! You get a FREE DESSERT! 🎉");
                System.out.println("✨ Enjoy your complimentary dessert with our compliments! ✨");
            }
        }
        
    }
}