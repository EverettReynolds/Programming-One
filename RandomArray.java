// Everett Reynolds
// 11-14-19

import java.util.ArrayList;
import java.util.*;
import java.util.Random;
public class RandomArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer> ();
		for ( int i = 0; i < 5; i++ )
		{
			
			System.out.println();
			for ( int j = 0; j < 10; j++)
			{
				list.add(rand.nextInt(41)+10);
				System.out.print(list.get(count) + " ");
				
				count++;
			}
		}
			
		
	}
}




