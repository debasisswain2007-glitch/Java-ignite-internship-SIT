import java.util.Scanner;
public class TravelExpenseCalculator {
public static double travelcost(double distance , double mileage)
{
	double petrol= distance/mileage;
	double petrolcost= petrol*104;
	return petrolcost;
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the travel distance:");
		double dist=sc.nextDouble();
		System.out.println("Enter the mileage of the vehicle:");
		double mil=sc.nextDouble();
		System.out.println("The price of petrol is 104 per litre");
	    double travelcost=travelcost(dist, mil);
	    System.out.println("The total travel expense is" +  travelcost);
	    

	}

}
