// Everett Reynolds
// 12-6-19


import java.util.*;
public class Teams { // creates the Teams object by instantiating it's variables, creating it's constructor, and creating a string of it's attributes

	private String Op1;
	private String Op2;
	private String Op3;
	private String Op4;
	private String Op5;
	private int meta;
public Teams(String op1, String op2, String op3, String op4, String op5, int m)
	{
	String Op1 = op1;
	String Op2 = op2;
	String Op3 = op3;
	String Op4 = op4;
	String Op5 = op5;	
	int meta = m;
	}




public String objectToString()
{
	String team = "";
	team = Op1 + Op2 + Op3 + Op4 + Op5 + " Viability: " + String.valueOf(meta);
	return team;
	
	
}


}
