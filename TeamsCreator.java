// Everett Reynolds
// 12-6-19
import java.util.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
public class TeamsCreator {
private String Op1 = ""; // Instantiation of Global Variables
private String Op2 = "";
private String Op3 = "";
private String Op4 = "";
private String Op5 = "";
private int metaPoints;
Scanner input1 = new Scanner (System.in); // output file Scanner
Scanner input2 = new Scanner (System.in); // input file Scanner
Scanner input3 = new Scanner (System.in); // string Scanner
Scanner input4 = new Scanner (System.in); // integer Scanner
private ArrayList<Teams> myTeam;

public TeamsCreator() // The Constructor  which creates an arrayList myTeam and the operators and their viability points
{
	myTeam = new ArrayList();
	String A1 = Op1 ;
	String A2 = Op2 ;
	String A3 = Op3 ;
	String A4 = Op4 ;
	String A5 = Op5 ;
	int viable = metaPoints;
	
}

public void writeFile() throws FileNotFoundException // creates a file and allows user to write and add ten operators from Attackers and Defenders
{
	System.out.println();
	System.out.println();
	System.out.println("What is your Output File?"); // Asks the user for their file name they would like to create
	String outputFile=input1.next();
	PrintWriter out = new PrintWriter(outputFile);
	String opContent;
	int opLimit = 0;
	while(opLimit < 10) // allows for only 10 operators to be chosen and put into the new file
	{
		System.out.println("Enter Operator Name:");
		opContent = input3.nextLine();
		out.write(opContent + "\n");
		
		opLimit++;
	}
	System.out.println("Your File Name is " + outputFile); // prints out file for convenience of user 
	out.close(); // closes the file PrintWriter
	

}
public void readFile() throws FileNotFoundException // reads the file that you just made in the last method for convenience of user and choosing of favorite operators
{
	String fileName; 
	ArrayList <String> teams = new ArrayList <String>();
	//System.out.println();
	System.out.println();
	System.out.println(" Enter File Name Above: ");
	fileName = input2.next();
	File myFile = new File (fileName);
	Scanner read = new Scanner ( myFile );
	String operator = "";
	while ( read.hasNextLine())
	{
		operator = read.nextLine();
		teams.add(operator);
	}
	for(String element: teams)
	{
		System.out.println(element);
	}
	read.close();
	
}
public void addToFile() // Adds your favorite five operators to the Teams object along with a meta score
{
	System.out.println("Enter Operator 1: ");
	Op1 = input3.nextLine();
	System.out.println("Enter Operator 2: ");
	Op2 = input3.nextLine();
	System.out.println("Enter Operator 3: ");
	Op3 = input3.nextLine();
	System.out.println("Enter Operator 4: ");
	Op4 = input3.nextLine();
	System.out.println("Enter Operator 5: ");
	Op5 = input3.nextLine();
	System.out.println("Enter Meta Score: ");
	metaPoints = input4.nextInt();
	Teams rainbowTeam = new Teams(Op1, Op2, Op3, Op4, Op5, metaPoints); // creates an object of the Teams object class and creates a report using toString to print out
	myTeam.add(rainbowTeam);
	System.out.println((myTeam.get(0)).toString());
	
}
public String toString() // This is the more complex toString method which creates the report for the object 
{
	int count = 1;
	int tempOpCount = 1;
	String report = "";
	report = report + " Team " + count ;
	System.out.println();
	report+= report + " Operator " + tempOpCount + ": " + Op1;
	tempOpCount++;
	report+= report + " Operator " + tempOpCount + ": " + Op2;
	tempOpCount++;
	report+= report + " Operator " + tempOpCount + ": " + Op3;
	tempOpCount++;
	report+= report + " Operator " + tempOpCount + ": " + Op4;
	tempOpCount++;
	report+= report + " Operator " + tempOpCount + ": " + Op5;
	report+= report + " Meta Score : " + metaPoints;
	for(int i=0; i<5; i++)
	{
		report+=myTeam.get(i).objectToString()+"\n";
	}
	return report;
	
	
	
}


public void teamRoster() throws FileNotFoundException // This is the method which reads the attacker and defender operator finals at the beginning, giving you a choice of which one to choose for what kind of team you want to make
{
	ArrayList<String> attackers = new ArrayList <String>();
	ArrayList<String> defenders = new ArrayList <String>();
	int teamChoice = 0;
	System.out.println("Which kind of team do you want to build? Press 1 for Attacking Operators or  Press 2 for Defending Operators.");
	teamChoice = input4.nextInt();
	while(teamChoice < 1 || teamChoice > 2)
	{
		System.out.println(" Please Enter a Valid Choice.");
		teamChoice = input4.nextInt();
	}
	if (teamChoice == 1)
	{
		File myFile = new File ("Attackers");
		Scanner tempScan = new Scanner ( myFile );
		String attack = "";
		
		while ( tempScan.hasNext())
		{
			attack = tempScan.nextLine();
			attackers.add(attack);
		}
		for(String element: attackers)
		{
			System.out.println(element);
		}
	}
	else
	{
		File myFile = new File ("Defenders");
		Scanner tempScan = new Scanner ( myFile );
		String defend = "";
		
		while ( tempScan.hasNext())
		{
			defend = tempScan.nextLine();
			defenders.add(defend);
		}
		for(String element: defenders)
		{
			System.out.println(element);
		}
		
	}
	
}






}
