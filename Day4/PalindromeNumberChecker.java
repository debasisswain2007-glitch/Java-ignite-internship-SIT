import java.util.Scanner;
public class PalindromeNumberChecker {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int unit=num%10;
		int tenth=(num%100)/10;
		int hundredth=num/100;
		int revnum=unit*100+tenth*10+hundredth;
		System.out.println("The reversed number is:" + revnum);
		if(num==revnum)
		{
			System.out.println("The entered number is a palindrome number.");
		}
		else {
			System.out.println("The entered number is not a palindrome number.");
		}

	}

}
