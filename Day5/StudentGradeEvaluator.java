import java.util.Scanner;

public class StudentGradeEvaluator {
    public static String getGrade(int marks) {
        if (marks >= 75) return "A Grade";
        if (marks >= 60) return "B Grade";
        if (marks >= 45) return "C Grade";
        return "Fail";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        System.out.println("Result: " + getGrade(marks));
        sc.close();
    }


	

}

