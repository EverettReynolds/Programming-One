import java.util.*;
import java.text.DecimalFormat;
public class MathCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double radius = 0.0; // creates a radius variable
	Scanner userInput = new Scanner(System.in); // creates a scanner
	System.out.println(" Please input your desired radius for the calculator to use."); // asks the user for the input of a radius
	radius = userInput.nextDouble();
	double sphereAr = surfaceArea(radius); // Instantiates the return values from the static methods
	double sphereVol = sphereVolume(radius);
	double circleAr = circleArea(radius);
	double circleCircum= circleCircumference(radius);
	DecimalFormat decimal = new DecimalFormat("#.###"); // creates a DecimalFormat object for three decimal places
	 System.out.println("the surface area of a sphere with a radius of  " +  radius + " is " + decimal.format(sphereAr)); // prints out statements including the radius and the answers to all four of the static methods calculated values 
	 System.out.println("the volume of a sphere with a radius of  " +  radius + " is " + decimal.format(sphereVol));
	 System.out.println("the area of a circle with a radius of  " +  radius + " is " + decimal.format(circleAr));
	 System.out.println("the circumference of a circle with a radius of  " +  radius + " is " + decimal.format(circleCircum));
	 
	}
	public static double surfaceArea(double radius){   // Calculates the surface area of a sphere given a radius
		 double area = 4.0 * Math.PI * Math.pow(radius, 2);
		 return area;
	}
	public static double sphereVolume(double radius) { // Calculates the volume of a sphere given a radius
		double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
	public static double circleArea(double radius) { // Calculates the area of a circle given a radius
		double circle = Math.PI * Math.pow(radius, 2);
		return circle;
	}
	public static double circleCircumference(double radius) { // Calculates the circumference of a circle given a radius
		double circumference = 2.0 * Math.PI * radius;
		return circumference;
	}
}



