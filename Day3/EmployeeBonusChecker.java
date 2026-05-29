package java_ignite_Day3;

import java.util.Scanner;

public class EmployeeBonusChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input employee details
        System.out.println("=== Employee Bonus Eligibility Checker ===\n");
        
        System.out.print("Enter years of experience: ");
        double yearsOfExperience = sc.nextDouble();
        
        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();
        
        System.out.print("Enter performance rating (3-5): ");
        int performanceRating = sc.nextInt();
        
        System.out.println("\n Result ");
        
        // Check eligibility
        boolean isEligible = false;
        int bonusAmount = 0;
        
        // First check: attendance below 60% -> immediate rejection
        if (attendance < 60) {
            isEligible = false;
            System.out.println("Not Eligible");
            System.out.println("Reason: Attendance below 60%");
        }
        // Check main conditions: more than 3 years AND attendance above 85%
        else if (yearsOfExperience > 3 && attendance > 85) {
            // Check performance rating and assign bonus
            switch (performanceRating) {
                case 5:
                    isEligible = true;
                    bonusAmount = 50000;
                    break;
                case 4:
                    isEligible = true;
                    bonusAmount = 30000;
                    break;
                case 3:
                    isEligible = true;
                    bonusAmount = 10000;
                    break;
                default:
                    isEligible = false;
                    break;
            }
            
            // Display output
            if (isEligible) {
                System.out.println("Eligible");
                System.out.println("Bonus Amount: ₹" + bonusAmount);
            } else {
                System.out.println("Not Eligible");
                System.out.println("Reason: Performance rating must be 3, 4, or 5");
            }
        } 
        else {
            isEligible = false;
            System.out.println("Not Eligible");
            System.out.println("Reason: Must have more than 3 years of experience AND attendance above 85%");
        }
        
        
    }
}
