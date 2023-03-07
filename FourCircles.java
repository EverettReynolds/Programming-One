
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

// Everett Reynolds
// 10-13-19
// This Program both creates and sets the characteristics of four circles. Keep in mind that the circles will barely be touching once the browser is fully extended on a 14.9 inch laptop screen

public class FourCircles extends JComponent
{

public void paintComponent(Graphics g)
{
	Graphics2D g2 = (Graphics2D)g; // Instantiates a graphics object
	g2.setStroke(new BasicStroke(10));
	int width = getWidth();  // sets the circles to fit to the changing of the browser's size
	int height = getHeight();
	
	g2.setColor(Color.RED);  // sets conditions of circle one
	Ellipse2D.Double circleOne = new Ellipse2D.Double(0,0,width/2,height/2);
	g2.fill(circleOne);
		
	g2.setColor(Color.ORANGE); // sets conditions of circle two
	Ellipse2D.Double circleTwo = new Ellipse2D.Double(675,350,width/2,height/2);
	g2.fill(circleTwo);
	
	g2.setColor(Color.cyan); // sets conditions of circle three
	Ellipse2D.Double circleThree = new Ellipse2D.Double(0,350,width/2,height/2);
	g2.fill(circleThree);
	
	g2.setColor(Color.BLACK); // sets conditions of circle four
	Ellipse2D.Double circleFour = new Ellipse2D.Double(675,0,width/2,height/2);
	g2.fill(circleFour);

}

}




