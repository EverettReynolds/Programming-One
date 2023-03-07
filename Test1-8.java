import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// These are the lines which create most of the variables needed to run this program
int coffeeCard = 0;
double order;
double coffeePrice =  2.00;
double specialDiscount = 0.8;
double totalCost = 0;
double payment = 0;
Scanner stamp = new Scanner (System.in); // this creates a new scanner to run through user input for coffee
System.out.println(" Welcome to Mercer Cafe! How many stamps do you have on your coffee stamp card?");
coffeeCard = stamp.nextInt(); // this moves to the next question asked
System.out.println("How many cups of coffee would you like?");
order = stamp.nextInt();
if ( coffeeCard >= 10 ) // these statements ask if the user has enough coffee stamps to apply the discount
{
	totalCost = specialDiscount * (order * coffeePrice);
}
else 
{

	totalCost = order * coffeePrice;
	}
while ( payment != totalCost ) // This statement checks to see if the user has paid the correct amount yet or not
{
	System.out.println( " Your total comes out to " + totalCost + "Please pay for your coffee with the appopriate amount of money");
	payment = stamp.nextDouble();
double change = 0;
	
	
	
	
	if (payment == totalCost)
{
	System.out.println ("Thank you for your payment! Here is your receipt!" );
	System.out.println ("********************************");
	System.out.println (" Total Cost with " + order + " @ 2.00 each        $" + (order*2));
	System.out.println(" Change = " + change);
	System.out.println("Special Discount is 20% off if you had 10 or more coffee card stamps at the beginning of the transaction!");
	System.out.println(" You added " + order + " coffee stamps to your card!");
	System.out.println(" Have a nice day!");
	
}
	change = payment - totalCost;
	if (payment < totalCost)
	{
		double newTotal = totalCost - payment;
		System.out.println(" You have not paid enough! please pay " + newTotal + " to finish the transaction!");
	}

if (payment > totalCost)
{
	 
	 change = payment - totalCost;
	 System.out.println ("Thank you for your payment! Here is your receipt!" );
		System.out.println ("********************************");
		System.out.println (" Total Cost with " + order + " @ 2.00 each        $" + (order*2));
		System.out.println(" Change = " + change);
		System.out.println("Special Discount is 20% off if you had 10 or more coffee card stamps at the beginning of the transaction!");
		System.out.println(" You added " + order + " coffee stamps to your card!");
		System.out.println(" Have a nice day!");
}
}

}
}

