// Everett Reynolds
//11-7-19

import java.util.*;
public class Fibonacci {

private int [] fibo; // instantiates global private variables
private int start ;
	public Fibonacci() // this is a constructor which creates a fibonacci array 
	{
		int [] fibo = new int [0];
	}
	public Fibonacci(int size) // this is a constructor which takes in a size set by the tester, and makes the fibonacci array that size with the values for the fibonacci array within it 
	{
	fibo = new int [size];	
	setFibo(size);
	}
	public void setFibo(int size) // determines the content of the fibonacci array
	{
		 fibo = new int [size];
		fibo[0]	= 1;
		if ( size == 0)
		{
			fibo[0] = 1;
		}
		else if ( size == 1)
		{
			fibo[0] = 1;
			fibo[1] = 1;
		}
		else
		{
			fibo[0] = 1;
			fibo[1] = 1;
		}
	for ( int i = 2; i < fibo.length; i++ )
	{
	fibo[i] = fibo[i-1] + fibo[i-2];
	
	}
		
	}
	public String toString() // This method converts all of the fibonacci content integers into strings
	{
		 
		String out = "";
		for( int i = 0; i < fibo.length; i++)
		{
			out+= i + " - " + fibo[i] + "\n";
		}
		return out;
	}
	
	
}
