// Everett Reynolds
//11-7-19


import java.util.*;
public class FibonacciTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int size;
	     Scanner in = new Scanner(System.in); // accepts user input for the size of the fibonacci array
	     System.out.println("Enter the number of desired Fibonacci values to compute for the Fibonacci array:");
	     size=in.nextInt();
	     Fibonacci myFib = new Fibonacci(); // creates a fibonacci object
	      myFib.setFibo(size); // sets it's array size
	      System.out.println(myFib.toString()); // converts all values into a string which can be printed out altogether
	}

}
