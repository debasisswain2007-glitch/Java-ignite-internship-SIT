package java_ignite_day2;
import java.util.Scanner;

public class StudentResultAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter student name: ");
        String studentName = input.nextLine();
        
        System.out.print("Enter marks for subject 1: ");
        double marks1 = input.nextDouble();
        
        System.out.print("Enter marks for subject 2: ");
        double marks2 = input.nextDouble();
        
        System.out.print("Enter marks for subject 3: ");
        double marks3 = input.nextDouble();
        
        double totalMarks = marks1 + marks2 + marks3;
        double average = totalMarks / 3;
        
        System.out.println("\n--- Result ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        
        // Bonus: Compare average with 50
        if (average > 50) {
            System.out.println("Average is greater than 50.");
        } else {
            System.out.println("Average is NOT greater than 50.");
        }
    }
}
