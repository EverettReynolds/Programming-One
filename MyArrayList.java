// Everett Reynolds
// 11-14-2019
import java.util.ArrayList;
import java.util.*;

public class MyArrayList
{
  final static int NUM_ITEMS = 6;


  public static void main(String[] args)
  {
	  
        ArrayList<Integer> a = new ArrayList<Integer>();


        fillUp (a);


        printOut(a);


        System.out.println("\nArrayList Sum :  " + sumUp(a));
        System.out.println("Num of Positive Values :  " + posCount(a));
  }


  private static void fillUp (ArrayList<Integer> a)
  {
	  Scanner input = new Scanner (System.in);
        
for ( int i = 0; i < 6 ; i ++)
{
	System.out.println(" Enter Value " + (i+1));
	a.add(input.nextInt());
}


  }
  private static void printOut (ArrayList<Integer> a)

  {
	  System.out.println("*** PrintOut of ArrayList ***");
	  for(int i = 0 ; i < NUM_ITEMS ; i++)
	  {
		  System.out.print(a.get(i)+ " ");
		  
	  }
	  System.out.println("");
	  System.out.println("*************************\r\n" + "");

  }
    private static int sumUp (ArrayList<Integer> a)
  {
    	int total = 0;
        
     for(int i = 0; i < 6; i ++)
     {
    	 total = total + a.get(i);
     }

        
     return total;
  }


  private static int posCount (ArrayList<Integer> a)
  {
	  int positiveNums = 0;
        
    for ( int i  = 0 ; i < NUM_ITEMS; i ++)
    {
    	if ( a.get(i) > 0)
    	{
    		positiveNums++;
    	}
    }  
     return positiveNums;
  }
}
