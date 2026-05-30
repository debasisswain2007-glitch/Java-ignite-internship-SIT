import  java.util.Scanner;
public class ShoppingDiscountSystem {
	public static double discount(double originalbill)
	{
		double disc= originalbill*0.10;
		double finalbill=originalbill-disc;
		return finalbill;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the original bill:");
		double originalbill=sc.nextDouble();
		double  finalbill= discount(originalbill);
		System.out.println("The final bill is " + finalbill);

	}

}
