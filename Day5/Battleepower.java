import java.util.Scanner;
public class Battleepower {
	public static int battlepower(int attack, int defense, int level)
	{
		int battlepower =(attack*defense)+level;
		return battlepower;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  name of your character: ");
		String name = sc.nextLine();
		System.out.println("Enter the attack power of the character:");
		int attack = sc.nextInt();
		System.out.println("Enter the defense power of the  character");
		int def=sc.nextInt();
		System.out.println("Enter the level of the character:");
		int lev=sc.nextInt();
		int battlepower = battlepower(attack,def,lev);
		System.out.println("The total battle power of the character is " + battlepower);

	}

}
