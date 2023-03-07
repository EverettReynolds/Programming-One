import java.util.*;
//A class to solve for the area and circumference of a circle given a radius
//Written by Student Name
//Date: 10-20-2019

public class Circle {

	//This part is called the constructor and lets us specify the radius of a particular circle.
	private double radius;
	Scanner in = new Scanner ( System.in );
		public Circle(double r)
		{
			radius = r;
		}
		
		//This is a method.  It performs some action (in this case it calculate
		public double area()
		{
			double a = Math.PI * Math.pow(radius, 2);
			return a;
			
		}
		
		//This is a method.  It solves for the circumference of a circle.
		public double circumference()
		{
			double c = 2.0 * Math.PI * radius;
			return c;
		}
		
		public double getRadius()
		{
			return radius;
		}
		
		public void  setRadius(double r)
		{
			radius = r;
			
		} 
		
		public double diameter()
		{
			double d = radius + radius;
			return d;
		}
		
	}
		
		
		
	
