import java.util.Scanner;

class Order {
    private String orderId, customerName, productName;
    private int quantity;
    private double pricePerItem;
    
    // Constructor
    public Order(String orderId, String customerName, String productName, int quantity, double pricePerItem) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    // Calculate total
    public double calculateTotal() {
        return quantity * pricePerItem;
    }
    
    // Apply discount and return final amount
    public double applyDiscount() {
        double total = calculateTotal();
        if (total > 10000) return total * 0.8;  // 20% discount
        if (total > 5000) return total * 0.9;   // 10% discount
        return total;
    }
    
    // Display order details
    public void displayOrder() {
        double total = calculateTotal();
        double finalAmount = applyDiscount();
        double discount = total - finalAmount;
        
        System.out.println("\n--- Order Details ---");
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Price/Item: ₹%.2f\n", pricePerItem);
        System.out.printf("Subtotal: ₹%.2f\n", total);
        System.out.printf("Discount: ₹%.2f\n", discount);
        System.out.printf("Final Amount: ₹%.2f\n", finalAmount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== E-Commerce Order System ===\n");
        
        // Take input
        System.out.print("Enter Order ID: ");
        String orderId = sc.nextLine();
        
        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();
        
        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();
        
        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();
        
        System.out.print("Enter Price Per Item: ₹");
        double price = sc.nextDouble();
        
        // Create order and display
        Order order = new Order(orderId, customerName, productName, quantity, price);
        order.displayOrder();
        
        sc.close();
    }
}