import java.util.*;
public class StringMutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase= "Change is inevitable"; // This is the original String
		System.out.println("Original string: \" " + phrase+ "\" " );
		System.out.println("Length of string: " +phrase.length());
		String mutation1=phrase.concat(",except from vending machines."); // This mutation adds a phrase to the end of the original phrase
		System.out.println("Mutation 1 : " + mutation1);
		String mutation2 = mutation1.toUpperCase();
		System.out.println(" Mutation 2 : " + mutation2);
		String mutation3 = mutation2.replace('E','X');
		System.out.println(" Mutation 3 : " + mutation3);
		String mutation4 = mutation3.substring(3,30);
		System.out.println(" Mutation 4 : " + mutation4);
		System.out.println("Mutated Length: " + mutation4.length());
		
		String dude = "Hell Yeah Dude";
		System.out.println(dude);
		String bro = dude.replace("e", "t");
		System.out.println(bro);
		String guy = bro.concat(" Bro Bitches");
		System.out.println(guy);
		
		

	}

}
