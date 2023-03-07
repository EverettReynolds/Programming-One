// Everett Reynolds
// 11-16-19


import java.util.*;
public class Word {
private ArrayList <String> gameWords = new ArrayList <String>(); // This is the creation of all the global variables needed to be accessed in this method
private int initialGamePoints = 300;
private String playerGuess;
private String randomWord;
private int wordNumber;
private int attemptNumber;
private Scanner input1 = new Scanner ( System.in );
private Scanner input2 = new Scanner ( System.in );
Random rand = new Random();
public Word() // This is the word class constructor, which sets the start of the game and all of it's values in the tester
{
	ArrayList <String> gameWords = new ArrayList <String>();
	int initialGamePoints = 300;
	String playerGuess;
	String randomWord;
}
public void loadWords() // the method here loads an array list of Strings input by the user, notice the two scanners, as scanners can only parse one data type at a time
{ 
	String enteredWord; // creation of a local string variable
	System.out.println(" Welcome to The Word Guesser Game!!");
	System.out.println(" The Goal of this game is to guess the correct word out of a list of words you have inputted.");
	System.out.println(" How many words would you like to guess from?");
	wordNumber = input1.nextInt();
	System.out.println(" Enter the Word you would like to guess.");
	for( int i = 0; i < wordNumber; i++ )
	{
		enteredWord =input2.nextLine();
		gameWords.add(enteredWord);
	}
	System.out.println("############################################################");
	
}
public String generateRandomWord() // Chooses the random word out of the inputted words for the games
{

	int index = rand.nextInt(gameWords.size());
	randomWord = gameWords.get(index);
	return randomWord;
	
	
}
	
public void printWords() // This method prints the array
{
	System.out.print("[ ");
	for(int i = 0; i < gameWords.size(); i++)
	{
		System.out.print(gameWords.get(i) + " | ");
	}
	System.out.print("] ");
	System.out.println("");
	System.out.println("############################################################");
}



public String getWord() // This is the getter method returns the random word
{
	System.out.println( "The random game word was " + randomWord);
	return randomWord;
}




public void gameRules() // This method lays out the rules of the game through print statements
{
	System.out.println();
	System.out.println(" You will have three attempts to guess the correct word from the list.");
	System.out.println("You will start with 300 points, and your points will be updated with every guess attempt and game you play.");
	System.out.println(" You will lose 100 points with every wrong guess, and you will gain 100 points with every correct guess.");
	System.out.println("");
	System.out.println("############################################################");
}




public void playGame() // This is the method which runs through the game
{
	randomWord = generateRandomWord(); // This call allows the random word data to come to this method within the methods class
	int gameChoice = 0;
	System.out.println("Ready to play?");
	System.out.println("Too bad, I already assigned a random word for you to guess.");
	System.out.println("Get Guessing!");
	playerGuess = input2.nextLine();
	while ( !playerGuess.equals(randomWord) && attemptNumber < 3)  // There are two conditions to properly facilitate game flow
	{
		attemptNumber++;
		initialGamePoints = initialGamePoints - 100;
		System.out.println(" You now have a score of " + initialGamePoints + " and you have used " + (attemptNumber) + " Attempts!");
		if ( attemptNumber == 2) // This is a fix to an issue I had with allowing for four attempts instead of 3.
		{
			attemptNumber++;
			
		}
		System.out.println(" YOU FOOL! you did not guess correctly. Could you kindly try again?");
		playerGuess = input2.nextLine();
		
	}
	
	if( playerGuess.equals(randomWord) ) // This happens if you win the game
	{
		System.out.println(" CoNgRaTuLatIoNs!!! You won the game. Have a free $100. Just kidding, all you get is 100 more points to lose.");
		System.out.println(" You won the game with " + (attemptNumber) + " attempts used, and have a final score of " + (initialGamePoints+100) + " Points!");
		initialGamePoints = initialGamePoints + 100;
		System.out.println("");
		System.out.println("############################################################");
		System.out.println("");
	}
	else if (attemptNumber == 3) // This happens if you lose the game
	{
		initialGamePoints = initialGamePoints - 100;
		System.out.println(" HAHHAHHAHAHHAHAHAHHAHAAHA LOOOOOOOOSER");
		getWord();
		System.out.println("############################################################");
		System.out.println("");
	}
	else
	{
	}
	System.out.println(" Would you like to play again and make an idiot of yourself? Type 1 to continue or Type 2 to exit.");
	gameChoice = input1.nextInt();
	while(gameChoice < 0 || gameChoice > 2) // a catch for people who do not know what the number 1 or 2 is
	{
		System.out.println(" Enter a valid choice you imbecile :P");
		gameChoice = input1.nextInt();
	}
	if ( gameChoice == 1)
	{
		attemptNumber = 0;
		initialGamePoints = initialGamePoints; // This says it does nothing, However, it updates the initial game points so it does not start at 300 again
		System.out.println("############################################################");
		playGame();
		
		
	}
	if (gameChoice == 2)
	{
		System.out.println(" Have a great day YOU WINNER!");
		
	}
	
		
	}
	
}


