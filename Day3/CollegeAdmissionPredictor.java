package java_ignite_Day3;
import java.util.Scanner;

public class CollegeAdmissionPredictor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== College Admission Predictor ===\n");
        
        // Input marks
        System.out.print("Enter Maths marks: ");
        int maths = scanner.nextInt();
        
        System.out.print("Enter Physics marks: ");
        int physics = scanner.nextInt();
        
        System.out.print("Enter Chemistry marks: ");
        int chemistry = scanner.nextInt();
        
        System.out.println("\n--- Result ---");
        
        // Check if any subject is below 35
        if (maths < 35 || physics < 35 || chemistry < 35) {
            System.out.println("❌ Admission Status: Rejected");
            System.out.println("Reason: One or more subjects below 35");
        } 
        else {
            // Calculate total average
            double average = (maths + physics + chemistry) / 3.0;
            
            // Check eligibility conditions
            boolean condition1 = (maths >= 70 && physics >= 60 && chemistry >= 60);
            boolean condition2 = (average >= 80);
            
            if (condition1 || condition2) {
                System.out.println("✅ Admission Status: Eligible");
                
                // Check for scholarship
                if (maths > 90 && physics > 90 && chemistry > 90) {
                    System.out.println("🏆 Scholarship Status: Eligible for Scholarship");
                } else {
                    System.out.println("📚 Scholarship Status: Not Eligible for Scholarship");
                }
            } 
            else {
                System.out.println("❌ Admission Status: Not Eligible");
                System.out.println("Reason: Does not meet minimum criteria");
                System.out.println("(Need: Maths≥70 & Physics≥60 & Chemistry≥60 OR Average≥80)");
            }
        }
        
        
    }
}
