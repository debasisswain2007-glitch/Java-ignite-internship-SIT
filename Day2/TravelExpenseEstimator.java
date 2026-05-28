package java_ignite_day2;
import java.util.Scanner;

public class TravelExpenseEstimator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter travel distance (in KM): ");
        double distance = input.nextDouble();
        
        System.out.print("Enter petrol price per liter: ");
        double pricePerLiter = input.nextDouble();
        
        System.out.print("Enter vehicle mileage (KM per liter): ");
        double mileage = input.nextDouble();
        
        double petrolNeeded = distance / mileage;         // liters required
        double totalCost = petrolNeeded * pricePerLiter;
        
        System.out.println("\n--- Travel Expense Estimate ---");
        System.out.println("Petrol needed: " + petrolNeeded + " liters");
        System.out.println("Total travel cost: " + totalCost);
    }
}
