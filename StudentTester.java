import java.util.*;
// Everett Reynolds 
// CSC 204
public class StudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student("Everett Reynolds" , "11008623","True"); // creates an object of the Student Class used to call the methods of the Student Class
		 
		String student_name = ""; // Creates empty strings to receive the values from the Constructor
		 String student_ID_number = "";
		 String scholarship = "";
		 
		 student_name = stud.getName(student_name); // creates strings which receives the names from the Student Class
		student_ID_number = stud.getStudentID(student_ID_number);
		scholarship = stud.scholarship(scholarship);
		
		System.out.println("The Student's name is " + student_name); // this sections returns print statements for the student name, id and scholarship status.
		System.out.println("The Student's ID Number is " + student_ID_number); 
		System.out.println("The Student's scholarship status is " + scholarship); // scholarship status is if true, the student has scholarships. If false, they do not.
		
		
		

	}

}
