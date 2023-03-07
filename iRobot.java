import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import java.awt.Rectangle;

// Author: Everett Reynolds
// 10-13-19
// This program creates the shapes of the graphics used for creating a T-Posing Robot
public class iRobot extends JComponent {
public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g; // Instantiates a graphics object
		g2.setStroke(new BasicStroke(10));
		int width = 100;  // sets the shapes to fit to the changing of the browser's size
		int height = 100;
		
		g2.setColor(Color.black); // sets the conditions of rectangle one
	    Rectangle Rect1 = new Rectangle(175, 175, width, height); 
		g2.fill(Rect1);
		
		g2.setColor(Color.RED);  // sets conditions of circle one
		Ellipse2D.Double circleOne = new Ellipse2D.Double(175,75,width,height);
		g2.fill(circleOne);
		g2.setColor(Color.darkGray);
		g2.drawLine(280, 200, 375, 200); // Sets conditions of the robot's arms
		g2.drawLine(75, 200, 170, 200);
		g2.drawLine(200, 280, 200, 400); // Sets conditions of the robot's legs
		g2.drawLine(250, 280, 250, 400);
		g2.drawArc(187, 135, 75, 20, 0, 200); // Sets conditions of the robot's Frown
		g2.drawLine(190, 100, 210, 100); // Sets conditions of the robot's eyes
		g2.drawLine(240, 100, 260, 100);
		
		
	

}
}
