// Everett Reynolds
// 10-27-19
import java.util.*;
public class ForLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu(); // This calls the menu method and starts the running of the for loops program
		
		
	}
		 public static void  forLoopOne()  // This Loop will output a word or phrase the amount of times equal to it's characters
		{
			 System.out.println("Enter a Word.");
			 Scanner input = new Scanner ( System.in );
			String word = "";
			word = input.nextLine();
			int length = word.length();
			for ( int i = 0 ; i < length; i++)
			{
				System.out.println(word);
			}
		}
		 public static void  forLoopTwo() // This loop will start at an int of two, stops at 90, and increment by 5
			{
				for ( int i = 2; i < 90; i = i + 5)
				{
					System.out.print(i + " ");
				}
			}
		 public static void  forLoopThree() // This loop will start at an int of five , stops at 30, and increments by 2
			{
				for ( int i = 5; i < 30; i = i + 2)
				{
					System.out.print(i + " ");
				}
			}
		 public static void  forLoopFour() // This triangle outputs a triangle of an inputted phrase of decreasing letters
			{
			 System.out.println("Enter a Word.");
			 Scanner input = new Scanner ( System.in );
			String word = "";
			word = input.nextLine();
			int length = word.length();
			for ( int i = 0; i < length; i++)
			{
				System.out.println(word.substring(i,length));
				
				
			}
			
			}
		 public static void  forLoopFive() // This loop outputs an inputted phrase in an increasing triangle of characters
			{
			 System.out.println("Enter a Word.");
			 Scanner input = new Scanner ( System.in );
			String word = "";
			word = input.nextLine();
			int length = word.length();
			for ( int i = length; i >= 0; i--)
			{
				System.out.println(word.substring(i,length));
			}
			}
		 public static void  forLoopSix() // This loop outputs a multiplication table up to ten for an inputted integer number
			{
			 Scanner in = new Scanner ( System.in );
				System.out.println(" What number do you want to multiply to ten?");
				int number = in.nextInt();
				for ( int i = 1; i < 11; i++)
				{
					System.out.println(i + " " + i*number);
				}
			}
		 public static void  forLoopSeven() // This Loop creates a number of rows and columns exactly as inputted
			{
			 Scanner input = new Scanner ( System.in );
			 int row = 0;
			 int col = 0;
			 System.out.println("How Many Rows?");
			 row = input.nextInt();
			 System.out.println("How Many Columns?");
			 col = input.nextInt();
			 for( int i = 0; i < row ; i++)
			 {
				 for ( int j = 0; j < col ; j++)
				 {
				 System.out.print("*");
				 }
				 System.out.println("*");
			 }
			}
		 public static void  forLoopEight() // This loop creates a triangle starting with 9 asterisks and decrementing by 2 until none remain 
			{
			 for(int i = 0; i < 10; i = i + 2)
				{
					for  ( int j = 9-i; j > 1 ; j--)
					{
						System.out.print("*");
					}
					System.out.println("*");
				}
			}
		 public static void  menu()
			{
			 Scanner input = new Scanner ( System.in );
			 int choice;
				System.out.println(" Which loop would you like to execute?");
				choice = input.nextInt();
				while ( choice < 1 || choice > 9)
				{
				  System.out.println("Please Input a Valid Loop Choice!");
				  choice = input.nextInt();
				}
				while ( choice > 0 && choice < 10)
				{
					if ( choice == 1 )
					{
						forLoopOne();
						System.out.println(" Would you like to run another loop? If so, Enter another valid number. Type 9 to exit.");
						 choice = input.nextInt();
					}
					else if ( choice == 2 )
					{
						forLoopTwo();
						System.out.println(" Would you like to run another loop? If so, Enter another valid number. Type 9 to exit.");
						 choice = input.nextInt();
					}
					else if ( choice == 3 )
					{
						forLoopThree();
						System.out.println(" Would you like to run another loop? If so, Enter another valid number. Type 9 to exit.");
						 choice = input.nextInt();
					}
					else if ( choice == 4 )
					{
						forLoopFour();
						System.out.println(" Would you like to run another loop? If so, Enter another valid number. Type 9 to exit.");
						 choice = input.nextInt();
					}
					else if ( choice == 5 )
					{
						forLoopFive();
						System.out.println(" Would you like to run another loop? If so, Enter another valid number. Type 9 to exit.");
						 choice = input.nextInt();
					}
					else if ( choice == 6 )
					{
						forLoopSix();
						System.out.println(" Would you like to run another loop? If so, Enter another valid number. Type 9 to exit.");
						 choice = input.nextInt();
					}
					else if ( choice == 7 )
					{
						forLoopSeven();
						System.out.println(" Would you like to run another loop? If so, Enter another valid number. Type 9 to exit.");
						 choice = input.nextInt();
					}
					else if ( choice == 8 )
					{
						forLoopEight();
						System.out.println(" Would you like to run another loop? If so, Enter another valid number. Type 9 to exit.");
						 choice = input.nextInt();
					}
					else if ( choice == 9)
					{
						System.out.println(" Thank you and have a nice day!");
						choice++;
					}
				}
				
			} 
	}


