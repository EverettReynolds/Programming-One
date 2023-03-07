import java.util.*;
public class BankAccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

 double amount;  // Variables are instantiated here
 double balance = 0;
 int count = 0;
 int choice = 0 ;
 Scanner in = new Scanner ( System.in );
 
 System.out.println(" How much money is initially in your bank account?"); // Allows the user to input how much money their bank account has to start, reducing ambiguity for this setting of programming. I am not a bank unfortunately.
 double initialAmount = in.nextInt();
 BankAccount myBankAccount = new BankAccount(initialAmount);
 
 myBankAccount.menu();  // starts the menu function within the program and begins the real meat of the program
 choice = in.nextInt();
 
 while ( choice < 0 || choice > 6) // Does not allow for the user to continue until a correct choice number is input.
 {
	 System.out.println("Invalid choice number, Type a valid choice option to continue");
	 choice = in.nextInt();
 }
 
 
 while ( choice > 0 && choice < 6 && count == 0) // For loop allowing for multiple loops as long as a certain choice is pressed. Menu is brought up after every option.
 {
	 if (choice == 1) // Deposit function
	 {
		 System.out.println("Enter The amount of your deposit.");
		 amount = in.nextDouble();
		 myBankAccount.deposit(amount);
		 balance = myBankAccount.getBalance();
		 System.out.println( " Your Balance is " + balance);
		 choice = 5;
	 }
	 if (choice == 2) // Withdraw Function
	 {
		 System.out.println(" Enter the amount you would like to withdraw.");
		 amount = in.nextDouble();
		 while ( amount > myBankAccount.getBalance() )
		 {
			 System.out.println(" You cannot withdraw any funds. Please Withdraw a valid amount.");
			 amount = in.nextDouble();
		 }
		 myBankAccount.withdraw(amount);
		  balance = myBankAccount.getBalance();
		 System.out.println(" Your Balance is " + balance);
		 choice = 5;
	 }
	 if (choice == 3) // gets the balance function
	 {
		balance =  myBankAccount.getBalance();
		System.out.println(" Your Bank Account's total amount of funds is " + balance);
		choice = 5;
	 }
	 if ( choice == 4 ) // starts the exit function and ends the program
	 {
		 System.out.println(" Thank you for using our bank account services!");
		 System.out.println(" Have a Pleasant Day! ");
		 count = count + 2;
	}
    if ( choice == 5) // Used to reinvoke the menu function
	{
		myBankAccount.menu();
		choice=in.nextInt();
	}
	
 }
	}

	}

