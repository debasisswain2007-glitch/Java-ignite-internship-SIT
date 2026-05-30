import java.util.Scanner;
public class BattleArenaWinner {
	public static void winner(int p1, int p2)
	{
		if(p1>p2)
		{
			System.out.println("Player 1 wins");
		}
		else {
			System.out.println("Player 2 wins");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player 1 score:");
		int p1= sc.nextInt();
		System.out.println("Enter the player 2 score:");
		int p2=sc.nextInt();
		winner(p1,p2);

	}

}
