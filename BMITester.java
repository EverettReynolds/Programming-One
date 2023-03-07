import java.text.DecimalFormat;
import java.util.*;
public class BMITester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height = 0; //initializes global variables
		int weight = 0;
		int [] userHeight;
		int [] userWeight;
		int choice;
		int size;
		Scanner input = new Scanner ( System.in );
		DecimalFormat three = new DecimalFormat();
BMICalculator start = new BMICalculator();
System.out.println(" Welcome to The BMI Calculator! "); // the startup screen
System.out.println("");
start.printBMI(); // calls the BMI chart method
start.menu();
choice = input.nextInt();
switch(choice) // Switch statement to determine which choice is selected and which constructor to use as a result
{
 case 1:
 {
	 BMICalculator single = new BMICalculator();
	 single.getPersonData();
	 single.computePersonBMI();
	 single.personHealthStatus();
	 break;

 }
case 2:
{
	System.out.println(" How many people are in your group?");
	size = input.nextInt();
	BMICalculator group = new BMICalculator();
	group.computePeopleBMI(size);
	group.groupAverage();
	group.groupHealthStatus();
	break;
	
}
case 3:
{
	System.out.println("Goodbye and thank you for using the BMI calculator!");
	break;
}
default:
{
	System.out.println("Goodbye and thank you for using the BMI calculator!");
	break;
}
}


	}

}
