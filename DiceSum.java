import java.util.*;  // These statements import necessarily elements for this java class
import java.util.Random;
public class DiceSum {
	
	 private int totalDiceRolls = 0; // These statements instantiate private ints that cannot be changed by anyone outside of this class
	 private int userSum;
	 private int diceRollSum;
	Scanner input = new Scanner ( System.in ); // This statement creates an object of the scanner class for user input
	Random rand = new Random(); // This statement creates an object of the random class for random number generation
	public void instructions() 
	{
		System.out.println(" Welcome to The Dice Sum Game! ");  // This block of code creates a set of statements which gives users instructions on how to play the dice sum game
		System.out.println(" This game is played with two virtual dice and your guesses! ");
		System.out.println(" Your job is to submit a user guess between the numbers of 2 and 12 ( the sum of 2 standard six sided dice ) ");
		System.out.println(" Our job is to see how many attempts it takes before the dice rolls match your guess! ");
		System.out.println(" Ready to play? OF COURSE YOU ARE!!");
		
	}
	
	public void getUserSum()
	{
		System.out.println(" What is your dice sum guess? "); // This block asks the user for a dice sum guess, and checks to see whether it is within the range required for the game
		 userSum = input.nextInt();
		 while ( userSum < 2 || userSum > 12)
			 getUserSum();      // If it is not within the method, the user is prompted to reinput another guess ( I know this is not exactly what was wanted but it is my work around )
		 
		 
		
	}
	public void roll()
	{
		int Dice1; // This block creates the dice which are used in the game, and create their rolls ints and their sums, printing our what they are and their sum
		int Dice2;
		Dice1 = rand.nextInt(6-1+1)+1;
		Dice2 = rand.nextInt(6-1+1)+1;
		diceRollSum = Dice1 + Dice2;
		System.out.println("Roll: " + Dice1 + " and " + Dice2 + " = " + diceRollSum);
		
	}
	
	public int playGame()
	{
		instructions(); // This block of code actually plays the game. If the user sum is not equal to the dice roll sum, the game will keep going until it is equal, prompting a win message
		getUserSum();
		while ( userSum != diceRollSum)
		{
			roll();
			totalDiceRolls++;
		}
		
			System.out.println(" Congradulations, You Won! It only took you " + totalDiceRolls + " guesses to win!");
		return totalDiceRolls;
		
	}
	

}
