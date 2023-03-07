// By Everett Reynolds
 import java.util.*;
public class NameSong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Part 1 Questions
		// a- 12
		// b- a
		// c- G
		// d- 2
		// e- GANDALF THE GRAY
		// f- There will be no output because there is no upper case B due to the use of the toLowerCase function
		// g- o Baggins
		// h- dalf The GR
		// i- Goondoolf The GRAY
		// j- Gandalf The GRAY there is no change the original string as gray would need to be in all caps to work
		Scanner song = new Scanner(System.in); // creates a scanner for user inputed names
		System.out.println("Enter Your First and Last Name for a personalized song!"); // prompts user for input
		String fullName=song.nextLine(); // continues the program
		int space = fullName.indexOf(" "); // looks for space to separate first and last name
		String firstName = fullName.substring(0,space); // First name
		String lastName = fullName.substring(space+1); // Last name 
		System.out.println("Here is your song " + fullName + ":");  //  This is the series of print statements which produces the song
		System.out.println(firstName + " " + firstName + ",bo-" + firstName.replace(firstName.substring(0,1),"B"));
		System.out.println("Banana-fana fo-" + firstName.replace(firstName.substring(0,1),"F"));
		System.out.println("Fee-fi-mo-" + firstName.replace(firstName.substring(0,1),"M"));
		System.out.println(firstName.toUpperCase() + "!");
		System.out.println(lastName + " " + lastName + ",bo-" + lastName.replace(lastName.substring(0,1),"B"));
		System.out.println("Banana-fana fo-" + lastName.replace(lastName.substring(0,1),"F"));
		System.out.println("Fee-fi-mo-" + lastName.replace(lastName.substring(0,1),"M"));
		System.out.println(lastName.toUpperCase() + "!");

		
	}

}
