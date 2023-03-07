import java.util.*;

public class Lab4 {

	public static void main(String[] args) {
		
String myName = "Everett Reynolds"; // Part 1
System.out.println(myName); 
double myBalance = 136.05; // Part 2
System.out.println("Bank Balance : $" + myBalance); // Part 3
String s = "The number of rabbits is "; // Part 4
int argh = 129;
String report = s + argh;
System.out.println(report);
String bigName = myName.toUpperCase(); // Part 5
System.out.println(bigName);
String fullName = " Everett Zane Reynolds"; //Part 6
int numChars = fullName.length(); 
System.out.println("Your name has " + numChars + " characters in it!");
System.out.println("Hello" + "\r\n" + "Hello Again"); // Part 7 // source https://www.baeldung.com/java-string-newline
// Part 8 // The output of the code is "I Wonder?"
}
}