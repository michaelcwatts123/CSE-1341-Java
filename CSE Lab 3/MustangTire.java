import java.util.Scanner;
public class MustangTire 
{
static double Total = 0.0;
static String invoice = "\nDescription\t\tQuantity\tAmount\n-----------------------------------------\n";
public static void main(String[] args)
{
int choice = 0;
int check = 0;
Scanner input = new Scanner(System.in);

while (check != 1) //determine if choice is valid
{
choice = displayMenu(input);

switch (choice){
	case 1: 
		
		purchaseTires(input);
		break;
	case 2:
		int hold = selectDeliveryOption(input);
		while (hold == -1)
		{ 
		System.out.println("Incorrect delivery option");
		hold = selectDeliveryOption(input);}
		updateTotal(getDeliveryFee(hold));
		break;
	case 3:
		scheduleTireInstallation(input);
		break;
	case 4:
		displayInvoice();
		break;
	case 9:
		System.out.println("Thank you for using Mustang Tires! Good-bye.");
		check = 1;
		break;
	default:System.out.println("Invalid Option");
		 break;
	

} //determine choice

} //end loop
} //end method
public static int displayMenu(Scanner input)
{
	int a;
	System.out.println("**Welcome to Mustang Tires. We have the tires you need!**");
	System.out.println("Choose from the following options: ");
	System.out.println("1) Purchase tires");
	System.out.println("2) Select a tire delivery option");
	System.out.println("3) Schedule a tire installation appointment");
	System.out.println("4) View invoice");
	System.out.println("9) Cancel order and exit store");
	System.out.println(" ");
	System.out.print("Menu option: ");
	a = input.nextInt();
	return a;
} //end method 


public static void purchaseTires(Scanner input)
{
	int tire = 5;
	int quant = 0;
	int test = 0;
	double x;
	
	while ((quant <= 0) && ((tire > 4) || (tire < 1) ))
	{
		if (test < 0)
			System.out.println("Invalid input, please try again");
		
		System.out.println("Inventory Number Description\t Price Per Tire\n");
		System.out.println("--------------------------------------------------------------");
		System.out.printf("1\t\t Ford Focus Tires\t $59.99\n");
		System.out.printf("2\t\t Chevy Malibu Tires\t $79.99\n");
		System.out.printf("3\t\t Toyota RAV4 Tires\t $99.99\n");
		System.out.printf("4\t\t BMW 5 series Tires\t $199.99\n");
		System.out.print("Enter the inventory number of the tires you want to purchase followed by the quantity: ");
		tire = input.nextInt();
		quant = input.nextInt();
		if (quant < 1)
			tire = 6;
		if (tire > 4 || tire < 1)
			quant = 0;
		test += 1;
	} //end loop to check if choice is valid
	x = calculateTirePrice(tire, quant);
	updateTotal(x);
} //end method
public static double calculateTirePrice(int type, int amount)
{
double sum;
sum = 0.0;
	switch(type){
		case 1: 
			invoice += "Ford Focus Tires\t";
			sum = 59.99 * amount;
			invoice += "\t" + amount + "\t$" + sum + "\n";
			break;
		case 2: 
			invoice += "Chevy Malibu Tires\t";
			sum = 79.99 * amount;
			invoice += "\t" + amount + "\t$" + sum + "\n";
			break;
		case 3: 
			invoice += "Toyota RAV4 Tires\t";
			sum = 99.99 * amount;
			invoice += "\t" + amount + "\t$" + sum + "\n";
			break;
		case 4: 
			invoice += "BMW 5 series Tires\t";
			sum = 199.99 * amount;
			invoice += "\t" + amount + "\t$" + sum + "\n";
			break;
	} //end switch
	
	return sum;
} //end method

public static void updateTotal(double sumTotal)
{
	Total += sumTotal;
	System.out.printf("Your current total is: $%.2f\n", Total);
}//end method
public static int selectDeliveryOption(Scanner input) //begin method
{
int x = 0;
System.out.println("Select from the following options:");
System.out.println("----------------------------------");
System.out.println("1) 5-7 days free shipping");
System.out.println("2) 3-5 days at $10.99");
System.out.println("3) Two-day shipping at $21.99");
System.out.println("4) Next day shipping at $45.99");
System.out.println(" ");
System.out.print("Delivery option: ");
x = input.nextInt();
if (x< 1 || x > 4)
	x = -1;
return x;
}//end method
public static double getDeliveryFee(int option) //begin method
{
	double total = 0.0;
	switch(option){
		case 1:
			invoice += "5-7 days\t\t\t-\t$0.00\n";
			break;
		case 2:
			invoice += "3-5 days\t\t\t-\t$10.99\n";
			total = 10.99;
			break;
		case 3: 
			invoice += "Two-day\t\t\t\t-\t$21.99\n";
			total = 21.99;
			break;
		case 4:
			invoice += "Next day\t\t\t\t-\t$45.99\n";
			total = 45.99;
			break;
			}
	return total;

} //end method
public static void scheduleTireInstallation(Scanner input) //begin method
{
int x = 0;
while (x < 1)
{
if (x == -1)
	{ System.out.println("Invalid Input"); }
System.out.println("Would you like a morning or afternoon appointment?");
System.out.println("(1 = Morning, 2 = Afternoon, 3 = exit)");
System.out.print("Installation option:");
x = input.nextInt();
if ((x < 1) || (x>3))
	x = -1;
}
	switch(x){
		case 1:
			updateTotal(89.99);
			invoice += "Morning installation\t\t-\t$89.99\n";
			break;
		case 2:
			updateTotal(99.99);
			invoice += "Afternoon installation\t\t-\t$99.99\n";
			break;
		case 3:
			
			break;
}

} //end method
public static void displayInvoice() //begin method
{
System.out.println(invoice);
System.out.println(" ");
System.out.printf("The total of your invoice is: $%.2f",Total);

} //end method

} //end class