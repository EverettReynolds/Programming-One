// Everett Reynolds
// 12-6-19
import java.io.FileNotFoundException;
import java.util.*;
public class TeamsCreatorTester {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
TeamsCreator team = new TeamsCreator(); // This is the creation of the TeamsCreator object
team.teamRoster(); // These are the method calls which allow the program to run
team.writeFile();
team.readFile();
team.addToFile();

	}

}
