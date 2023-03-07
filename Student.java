import java.util.*;
// Everett Reynolds
// CSC 204
public class Student {
	private String student_name; // instantiates global variables
	private String student_ID_number;
	private String scholarship;
	
	public Student(String Name, String ID, String scholar) // passes in information into the constructor to have methods do work on them
	{
		student_name = Name;
		student_ID_number = ID;
		scholarship = scholar;
	}
	public String getName(String Name) // a method which returns a Student Name String
	{
		return student_name;
	}
	public String getStudentID(String ID) // a method which returns a Student ID String
	{
		return student_ID_number;
	}
	public String scholarship(String scholar) // a method which returns a Student Scholarship Status String
	{
	return scholarship;
	}

}
