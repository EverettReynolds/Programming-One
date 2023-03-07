import javax.swing.JFrame;
// Everett Reynolds
// This program is used to view the Four different colored circles
public class FourCirclesViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame(); // creates the J frame for viewing the shapes
		  frame.setSize(1000,1000);
		  frame.setTitle("Four Circles");
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  
		  FourCircles One = new FourCircles(); // Instantiates circle object one to the J Frame
		  frame.add(One);
		  
		  FourCircles Two = new FourCircles(); // Instantiates circle object two to the J Frame
		  frame.add(Two);
		  
		  FourCircles Three = new FourCircles(); // Instantiates circle object three to the J Frame
		  frame.add(Three);
		  
		  FourCircles Four = new FourCircles(); // Instantiates circle object four to the J Frame
		  frame.add(Four);
		  
		  
		  frame.setVisible(true); // sets the visibility of the shapes to true

	}

}
