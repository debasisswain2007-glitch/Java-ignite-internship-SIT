package java_ignite_day2;
import java.util.Scanner;

public class OnlineShoppingBillGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter customer name: ");
        String customerName = input.nextLine();
        
        System.out.print("Enter product name: ");
        String productName = input.nextLine();
        
        System.out.print("Enter product price: ");
        double price = input.nextDouble();
        
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        
        double totalBill = price * quantity;
        
        System.out.println("\n--- Bill Details ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + totalBill);
    }
}
