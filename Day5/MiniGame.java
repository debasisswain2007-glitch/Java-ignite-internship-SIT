import java.util.Scanner;
public class MiniGame {
 public static void attack()
{
	 boolean isDefending=true;
	 int health=100;
	 int  enemyhealth=100;
	 if(isDefending)
	 {
		 
	 }
	System.out.println("Attack");
	System.out.println("enemy health decreased by 20" + )
}
 public static void defend()
 {
	boolean isDefending=true;
 }
  public static void heal()
 {
	 System.out.println("Heal");
 }
	public static void main(String[] args) {
		int health=100;
	     int enemyhealth=100;
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter your choice:");
	     System.out.println("1. Attack \t  2.Defend \t 3.Heal");
	     int choice = sc.nextInt();
	     
	     switch(choice)
	     {
	     case 1:
	    	 attack();break;
	     case 2: defend();break;
	     case 3: heal();break;
	     default:
	    	 System.out.println("invalid input");
	     }
	}

}
