import java.util.*;
public class BankAccount {

	private double balance; // global variables
	Scanner in = new Scanner ( System.in);
	// Constructor with arguments
	public BankAccount(double initialBalance) // This is the bank account constructor
	{
		//balance = balance + initialBalance;
		balance = initialBalance;
	}
	public void deposit(double amount) // deposit function
	{
		balance = balance + amount;
		
	}
	public void withdraw(double amount) // withdraw function
	{
		balance = balance - amount;
	}
	public double getBalance() // getter function that retrieves the balance
	{
		return balance;
	}
	public void menu() // invokes the menu function
	{
		System.out.println(" What would you like to do to your Bank Account?");
		System.out.println(" 1. Deposit Funds ");
		System.out.println(" 2. Withdraw Funds ");
		System.out.println(" 3. Get Balance of Bank Account ");
		System.out.println("  4. Exit ");
	}
	 }
	
	

