import java.util.Scanner;

class Mobile {
    String brand;
    private double price;  // PRIVATE as required
    int storage;
    
    // Constructor
    public Mobile(String brand, double price, int storage) {
        this.brand = brand;
        this.price = price;
        this.storage = storage;
    }
    
    // Method to display details (price shown only through this method)
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("-----------------------");
    }
    
    // Getter for price (optional but follows encapsulation)
    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== MOBILE DETAILS SYSTEM ===\n");
        
        // Creating 2 mobile objects with user input
        System.out.println("Enter details for Mobile 1:");
        System.out.print("Brand: ");
        String brand1 = sc.nextLine();
        System.out.print("Price (₹): ");
        double price1 = sc.nextDouble();
        System.out.print("Storage (GB): ");
        int storage1 = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        Mobile mobile1 = new Mobile(brand1, price1, storage1);
        
        System.out.println("\nEnter details for Mobile 2:");
        System.out.print("Brand: ");
        String brand2 = sc.nextLine();
        System.out.print("Price (₹): ");
        double price2 = sc.nextDouble();
        System.out.print("Storage (GB): ");
        int storage2 = sc.nextInt();
        
        Mobile mobile2 = new Mobile(brand2, price2, storage2);
        
        // Display details
        System.out.println("\n=== MOBILE DETAILS ===");
        mobile1.displayDetails();
        mobile2.displayDetails();
        
        sc.close();
    }
}
