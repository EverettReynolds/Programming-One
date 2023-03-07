// Everett Reynolds
// 10-31-19
import java.util.*;
public class Lab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int [] twos = new int [10]; // Part One 
	     int count = 2; // This block creates an array of 10 and a count variable which manually hard codes even numbers from 2-20 into the array and prints it out
		for ( int i = 0 ; i < 10 ; i++)
		{
			twos[i] = count;
			count = count + 2;
			System.out.print(twos[i] + " | ");
		}
		
		System.out.println();
		int [] randomArray = new int [20]; // Part 2
		Random rand = new Random(); // This Block of code creates an array of 20 random integers and finds which ones are even and odd, as well as, their average, total sum, minimum, and maximum
		double average = 0.0;
		double sum = 0.0;
		
		System.out.println(" 20 Random Array Values Between 10 and 50");
		for ( int i = 0 ; i < 20 ; i++ )
		{
			randomArray[i] = (int)(Math.random()*41) + 10;
			sum = sum + randomArray[i];
			average = sum/20;
			System.out.print(randomArray[i] + " | ");
		}
		System.out.println();
		
		
		System.out.print(" Even Array Values : ");
		for ( int i = 0 ; i < 20 ; i++)
		{
			if ( randomArray[i] % 2 == 0)
			{
				System.out.print(randomArray[i] + " | ");
			}
	
		}
		
		
		
		System.out.println();
		System.out.print(" Odd Array Values : ");
		for ( int i = 0; i < 20 ; i++)
		{
			if( randomArray[i] % 2 == 1)
			{
				System.out.print(randomArray[i] + " | ");
			}
		}
		
		
		
		int max = randomArray[0];
		int min = randomArray[0];
		for ( int i = 0; i < 20 ; i++ )
		{
			if ( randomArray[i] > max)
			{
				max = randomArray[i];
			}
			else if ( randomArray[i] < min)
			{
				min = randomArray[i];
			}
		}
		System.out.println("Total Amount: " + sum);
		System.out.println(" Highest Value in the Array: " + max);
		System.out.println(" Lowest Value in the Array: " + min);
		System.out.println("Average: " + average);
	}

	}



