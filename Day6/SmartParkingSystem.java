package java_ignite_day6;
import java.util.Scanner;
import java.util.ArrayList;

class SmartParkingSystem {
    String vehicleNumber;
    int hoursParked;
    String vehicleType;
    int parkingFee;
    
    SmartParkingSystem(String vehicleNumber, int hoursParked, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.hoursParked = hoursParked;
        this.vehicleType = vehicleType;
        
        if (vehicleType.equalsIgnoreCase("Bike")) parkingFee = hoursParked * 10;
        else if (vehicleType.equalsIgnoreCase("Car")) parkingFee = hoursParked * 30;
        else if (vehicleType.equalsIgnoreCase("Bus")) parkingFee = hoursParked * 50;
        else parkingFee = 0;
    }
    
    void display() {
        System.out.println("\n=== PARKING RECEIPT ===");
        System.out.println("Vehicle: " + vehicleNumber);
        System.out.println("Type: " + vehicleType);
        System.out.println("Hours: " + hoursParked);
        System.out.println("Fee: ₹" + parkingFee);
        System.out.println("======================");
    }
}

public class ParkingSystem {
    static ArrayList<SmartParkingSystem> records = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int totalRevenue = 0;
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== SMART PARKING ===");
            System.out.println("1. Park Vehicle");
            System.out.println("2. View All");
            System.out.println("3. Total Revenue");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 1) {
                System.out.print("Vehicle Number: ");
                String num = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                sc.nextLine();
                System.out.print("Type (Bike/Car/Bus): ");
                String type = sc.nextLine();
                
                SmartParkingSystem vehicle = new SmartParkingSystem(num, hours, type);
                records.add(vehicle);
                totalRevenue += vehicle.parkingFee;
                vehicle.display();
                System.out.println("✅ Parked Successfully!");
                
            } else if (choice == 2) {
                if (records.isEmpty()) System.out.println("No vehicles parked");
                else for (SmartParkingSystem v : records) v.display();
                
            } else if (choice == 3) {
                System.out.println("\n💰 Total Revenue: ₹" + totalRevenue);
                System.out.println("📊 Total Vehicles: " + records.size());
                
            } else if (choice == 4) {
                System.out.println("Thank you! 🚗");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
