import java.util.*;
import java.text.DecimalFormat;
public class BMICalculator {
private int height;
private int weight;
double BMI;
double groupAverage;
private int [] groupHeights;
private int [] groupWeights;
double personBMI;
double peopleBMI;
private double[] groupBMIs;
Scanner input = new Scanner ( System.in );
DecimalFormat three = new DecimalFormat("#.###");
	
	
	
public BMICalculator() // creates a BMI template with height and weight established
{
	int height;
	int weight;
}
public BMICalculator(int [] userHeight, int [] userWeight)// creates a BMI template with height and weight array established
{
	int [] groupHeights = new int[0];
	int [] groupWeights = new int[0];
}
public void getPersonData() // gets a single person's height and weight
{
		System.out.println(" Enter Your Height In Inches");
		height = input.nextInt();
		System.out.println(" Enter Your Weight In Pounds");
		weight = input.nextInt();
		
}	
	
	
	

public double computePersonBMI() // computes the BMI of a person
{
	double heightSquared = Math.pow(height, 2);
	double BMI = 703*weight/heightSquared;
	System.out.println(" Your BMI is " + three.format(BMI));
	return BMI;
	
	
}
public double computePeopleBMI(int size) //  gets the a group of people's heights and weights and computes the BMI of a group of people
{
	int [] groupHeights = new int[size];
	int [] groupWeights = new int[size];
	int userNumber = 1;
	for ( int i = 0; i < groupHeights.length; i++)
	{
		
		System.out.println(" Enter your height ( in inches ) for User " + userNumber);
		groupHeights[i] = input.nextInt();
		System.out.println(groupHeights[i]);
		System.out.println(" Enter your weight(in pounds) for User " + userNumber);
		groupWeights[i] = input.nextInt();
		System.out.println(groupWeights[i]);
		userNumber++;
		
		
	}
	 userNumber = 1;
	 groupBMIs = new double [size];
	
	for ( int i = 0; i < groupBMIs.length; i++ )
	{
		double heightSquared = Math.pow(groupHeights[i],2);
	    BMI = 703*groupWeights[i]/heightSquared;
	    groupBMIs[i] = BMI;
	    System.out.println(" Person " + userNumber + "'s BMI is " +three.format( BMI ));
	    userNumber++;
	    System.out.println("");
	    
		
	}
	return BMI;
}

public void groupAverage() // computes the average BMI of a group of people
{
	 
	for (int i = 0; i < groupBMIs.length; i++)
	{
		double total = 0;
		total = total + groupBMIs[i];
		groupAverage = total/groupBMIs.length+1;
	}
}
public void printBMI() // prints the BMI range index
{
	System.out.println("Body Mass Index (BMI) Range ");
	System.out.println("18.4 and under: Underweight. ");
	System.out.println("18.5 - 24.9 : Normal. "); 
	System.out.println("25.0 - 29.9: Overweight ");
	System.out.println("30.0 and above: Obese. ");
	System.out.println("");
}
public void personHealthStatus() // determines the health status of a person
{
	personBMI = computePersonBMI();
	if(personBMI < 18.4)
	{
		System.out.println(" Your BMI value is " + three.format(personBMI) + " and you are underweight" );
	}
	else if(personBMI >= 18.4 && personBMI <= 24.9)
	{
		System.out.println(" Your BMI value is " + three.format(personBMI) + " and you are normal weight" );
	}
	else if(personBMI >= 24.9 && personBMI <= 29.9)
	{
		System.out.println(" Your BMI value is " + three.format(personBMI) + " and you are overweight" );
	}
	else 
	{
		System.out.println(" Your BMI value is " + three.format(personBMI) + " and you are obese" );
	}
}
public void groupHealthStatus() // determines the health status of a group of people
{
	int size=0;
	peopleBMI = computePeopleBMI (size);
	if(peopleBMI < 18.4)
	{
		System.out.println(" The group's BMI value is " + three.format(peopleBMI) + " and they are underweight" );
	}
	else if(peopleBMI > 18.4 && peopleBMI <= 24.9)
	{
		System.out.println(" The group's BMI value is " + three.format(peopleBMI) + " and they are normal weight" );
	}
	else if(peopleBMI > 24.9 && peopleBMI <= 29.9)
	{
		System.out.println(" The group's BMI value is " + three.format(peopleBMI) + " and they are overweight" );
	}
	else 
	{
		System.out.println(" The group's BMI value is " + three.format(peopleBMI) + " and they are obese" );
	}
}
public void menu() // brings up the BMI options menu
{
	System.out.println("1. Find Individual BMI ");
	System.out.println("2. Find Group BMI ");
	System.out.println("3. Exit ");
	System.out.println("");
	



}
}
