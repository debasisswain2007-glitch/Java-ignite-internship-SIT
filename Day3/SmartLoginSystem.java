package java_ignite_Day3;
import java.util.Scanner;

 public class SmartLoginSystem 
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Smart Login System ===\n");
        
        // Input Username
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        
        // Switch for username validation
        switch (username) {
            case "admin":
                // Input Password
                System.out.print("Enter Password: ");
                String password = sc.nextLine();
                
                // Switch for password validation
                switch (password) {
                    case "Java@123":
                        System.out.println("\nUsername and Password correct!");
                       
			System.out.println("Enter the otp:");
			int otp=sc.nextInt();
			if(otp>1000 && otp<9999)
			{
				System.out.println("Logged in successfully");
			}
			else
			{
				System.out.println("Login failed");
			}
				
		       	}
            }
        }
 }