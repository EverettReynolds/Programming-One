import javax.swing.JFrame;
public class iRobotViewer {
// Everett Reynolds
// 10 - 13 - 19
// This program is used to view the T-Posing Robot
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame(); // creates the J frame for viewing the shapes
		  frame.setSize(500,500);
		  frame.setTitle(" My Robot ");
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  iRobot Rect1 = new iRobot(); // Instantiates Rectangle object one to the J Frame
		  frame.add(Rect1);
		  
		  iRobot One = new iRobot(); // Instantiates circle object one to the J Frame
		  frame.add(One);
		  
		  iRobot lineOne = new iRobot(); // Instantiates all of the line and arc object in the J frame
		  frame.add(lineOne);

		  
		  frame.setVisible(true); // Makes the shapes visible in the J Frame
	}

}
