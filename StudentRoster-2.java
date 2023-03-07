// Everett Reynolds
// 11-21-2019



import java.util.*;
public class StudentRoster {

private static int numStudents;	 // Creation of all global variables used in program
private static String StudentName;
private static String studentChoice;
private static int rosterPosition;
private static ArrayList <String> Roster = new ArrayList <String>();
private static Scanner inputInt = new Scanner ( System.in ); // Many Scanners to parse new units of data
private static Scanner inputMenu = new Scanner ( System.in );
private static Scanner inputStr = new Scanner ( System.in );
private static Scanner inputStr2 = new Scanner ( System.in );
private static Scanner inputStr3 = new Scanner ( System.in );
	
	
	
public StudentRoster() // Constructor to Initialise Array List
{
	numStudents = 0;
	ArrayList <String> Roster = new ArrayList <String>();
}


public static void loadStudents() // Adds a list of students to an ArrayList
{
	System.out.println(" How many students would you like to be on the roster?");
	numStudents = inputInt.nextInt();
	for ( int i = 0; i < numStudents; i++)
	{
		System.out.println(" What is the name of the student you would like to add?");
		Roster.add(inputStr.nextLine());
	}
	
	
	
	
	
	
}

public static void print() // Prints out the ArrayList of Students
{
	System.out.println(" Roster Names ");
	for( int i = 0; i < Roster.size(); i++)
	{
		System.out.print(Roster.get(i) + " | ");
	}
}


public static ArrayList<String> removeStudent() // removes a student from the Array if inputted student is within array
{
	studentChoice = "";
	System.out.println(" What Student would you like to remove from the roster?");
	studentChoice = inputStr2.nextLine();
	for (int i = 0; i < Roster.size(); i++)
	{
		rosterPosition++;
		if ( !Roster.contains(studentChoice))
		{
			System.out.println(" This Student is not in the Roster.");
			i = Roster.size();
		}
		else
		{
			Roster.remove(rosterPosition);
			System.out.println(studentChoice + " has been removed from the Roster.");
			i = Roster.size();
		}
	}
	System.out.println(Roster);
	return Roster;
	
}


public static ArrayList<String> edit() // edits a student's name if it is in the ArrayList already
{
	studentChoice = "";
	System.out.println(" What Student name would you like to edit in the roster?");
	studentChoice = inputStr3.nextLine();
	for (int i = 0; i < Roster.size(); i++)
	{
		rosterPosition++;
		if ( !Roster.contains(studentChoice))
		{
			System.out.println(" This Student is not in the Roster.");
			i = Roster.size();
		}
		else
		{
			System.out.println("What would you like the new name to be?");
			String newName = inputStr2.nextLine();
			Roster.set(i, newName);
			System.out.println(studentChoice + " has been changed in the Roster and " + newName + " is the new name in the Roster");
			i = Roster.size();
		}
	}
	return Roster;
}
public static void menu() // The menu which allows the user to choose what they want to do in the program
{
	int menuChoice;
	int required = 0;
	System.out.println("");
	System.out.println(" What would you like to do with your Student Roster?");
	System.out.println("1. Load Student Names into Roster.");
	System.out.println("2. Print Out Student Roster.");
	System.out.println("3. Remove a Student From The Roster.");
	System.out.println("4. Edit a Student's Name in The Roster.");
	System.out.println("5. Exit Roster. ");
	
	menuChoice = inputMenu.nextInt();
	
	
	switch(menuChoice)
	{
	case 1:
	{
	loadStudents();
	menu();
	break;
	}
	case 2:
	{
		print();
		menu();
		break;
	}
	case 3:
	{
		removeStudent();
		menu();
		break;
	}
	case 4:
	{
		edit();
		menu();
		break;
	}
	case 5:
	{
		System.out.println(" Goodbye and Thank you for using the Roster!");
		break;
	}
	default:
	{
		System.out.println(" Goodbye and Thank you for using the Roster!");
		break;
	}
	}
	
	
	
}


}
