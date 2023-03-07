import java.util.*;
import java.text.DecimalFormat;
//A class to instantiate an object of the Circle class and use (call) the methods of the Circle class. 
//Written by C. Robertson and Everett Reynolds
public class CircleTester {
public static void main(String[] args)
{
// TODO Auto-generated method stub
//Instantiating an object called cir1
DecimalFormat decimal = new DecimalFormat("#.##"); //creates a DecimalFormat object for two decimal places
Circle cir1 = new Circle (5.1);//Creates an object of the Circle.java class
cir1.setRadius(7.1); // Sets the radius of the circle to 7.1 from 5.1
double radius = cir1.getRadius(); // creates a variables that is used to display the new radius
double a = cir1.area(); // the object(cir1) call the area method to perform the calculation and return the result to the value c.
double c = cir1.circumference(); // creates a variable that calls to the circumference method
double d = cir1.diameter();// creates a variable that calls to the diameter method
System.out.println("The area of a circle with a radius of "+ radius + " is " + decimal.format(a)); // prints out a statement showing the area of a circle with a varying radius
System.out.println("The diameter of a circle with a radius of " + radius + " is " + decimal.format(d)); // prints out a statement showing the diameter of a circle with a varying radius
System.out.println("The circumference of a circle with a radius of " + radius + " is " + decimal.format(c)); // prints out a statement showing the circumference of a circle with a varying radius
}
}
