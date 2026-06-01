package java_ignite_day6;

public class Batman {

	class Batsman {
	    // Variables
	    String playerName;
	    int runs;
	    int balls;
	    int strikeRate;
	    
	    // Constructor - calculates strike rate
	    Batsman(String playerName, int runs, int balls) {
	        this.playerName = playerName;
	        this.runs = runs;
	        this.balls = balls;
	        this.strikeRate = (runs * 100) / balls;  // Calculate strike rate
	    }
	    
	    // Display method - only prints results
	    void display() {
	        System.out.println("Strike Rate = " + strikeRate);
	    }
	}

	// Main class to test the program
	public class CricketScorecard {
	    public static void main(String[] args) 
	    {
	        Batsman batsman = new Batsman("Gill", 75, 50);
	        batsman.display();
	    }

}
