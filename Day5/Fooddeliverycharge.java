import java.util.Scanner;
public class Fooddeliverycharge {
	public  static double deliverycharge(double orderamount)
	{
		double dc;
		if(orderamount > 500.00)
		{
			System.out.println("Free delivery");
			dc=0.00;
			return dc; 
		}
		else {
			dc= 50.00;
			return dc;
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order amount:");
		double orderamount=sc.nextDouble();
		double dc= deliverycharge(orderamount);
		System.out.println(" Delivery charge=" + dc);
	}

}
