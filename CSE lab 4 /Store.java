import java.util.Scanner;
import java.util.ArrayList; 
public class Store {

	public static void main(String[] args)  //begin main method
	{ 
		Scanner input = new Scanner(System.in);
		String[] Books = {"Into to Java", "Intro to C++", "Python", "Perl"}; //Initialize book name array
		String[] Dvds = {"Snow White", "Cinderella", "Dumbo", "Bambi"}; //Initialize DVD name array 
		double[] BookPrices = {45.99,89.34,100.00,25.00}; //Initialize Book price array 
		double[] DvdPrices = {19.99,24.99,17.99,21.99}; //Initialize DVD price array 
		ArrayList<String> cartItems = new ArrayList<>(); //create cart
		ArrayList<Double> prices = new ArrayList<>(); //hold price of items 
		int check = 0;
		while (check == 0) //determines if choice is valid 
		{
		int choice = displayMenu(input);
		switch (choice) //determines choice
		{
			case 1: 
				int desire = -1;
				while (desire == -1)
				{
				
				displayArrays(Books, BookPrices, "Books");
				
				 desire = getInventoryNumber(Books, BookPrices, cartItems, prices, input);
				}
				break;
			case 2:
				 desire = -1;
				while (desire == -1)
				{
				
				displayArrays(Dvds, DvdPrices, "Dvds");
				
				 desire = getInventoryNumber(Dvds, DvdPrices, cartItems, prices, input);
				}
				break;
			case 3:
				if (cartItems.isEmpty())
					System.out.println("Your cart is empty.");
					
				else
					displayArrays(cartItems, prices);
				
				break;
			case 4:
				if (cartItems.isEmpty())
					{
					
					System.out.println("Your cart is empty.");
					break;
					}
					
				else
					displayArrays(cartItems, prices);
					getTotal(prices);
					clearArrays(cartItems, prices);
				break;
			case 5:
				clearArrays(cartItems, prices);
				break;
			case 9:
				check = 1;
				break;
			default:
				System.out.println("This option is not acceptable");
				break;
		}
		}
	} //ends main method
	public static int displayMenu(Scanner input) //begins display menu method
	{
		int option;
		System.out.println("**Welcome to the Mustang Books and DVDs Store**");
		System.out.println(" ");
		System.out.println("Choose from the following options: ");
		System.out.println("1 - Browse books inventory and add a book to the car");
		System.out.println("2 - Broswse DVDs inventory and add a DVD to the cart");
		System.out.println("3 - View cart");
		System.out.println("4 - Checkout");
		System.out.println("5 - Cancel Order");
		System.out.println("9 - Exit Store");
		option = input.nextInt();
		return option; //returns menu choice
	} //ends menu methods
	public static void displayArrays(String[] itemsArray, double[] pricesArray, String itemType) //begins displayArray method to show inventory
	{
		System.out.println("Inventory Number \t" + itemType + "\t\t Prices");
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < 4; i++)
		{
			
			if (i < 2)
				System.out.printf((i + 1) + "\t\t\t" + itemsArray[i] + "\t" + " $%6.2f\n", pricesArray[i]);
			else
				System.out.printf((i + 1) + "\t\t\t" + itemsArray[i] + "\t\t" + " $%6.2f\n",pricesArray[i] );
		}
	} //ends method
	public static int getInventoryNumber(String[] itemsArray, double[] pricesArray, ArrayList<String> cart, ArrayList<Double> prices, Scanner input ) //Begins getInventoryMethod which determines what to put in users cart
	{
		System.out.println("Enter the inventory number of the item you want. Enter -1 to redisplay the inventory");
		int choose;
		choose = input.nextInt();
		if (choose == -1)
			return -1;
		else 
			
			cart.add(itemsArray[(choose -1)]); //adds selection to cart
			prices.add(pricesArray[(choose -1)]); //adds price to price array
			
			return 0;
	}
	public static void displayArrays(ArrayList<String> cart, ArrayList<Double> prices) //begins displayArray method which displays cart
	{
		System.out.println("Items\t\t\tPrices" );
		System.out.println("-------------------------------");
		for(int i = 0; i < cart.size(); i++) {
			String tester = cart.get(i);
			if (tester.equals("Python") || tester.equals("Perl") || tester.equals("Dumbo") || tester.equals("Bambi"))
				System.out.printf(cart.get(i) + "\t\t\t$%6.2f\n", prices.get(i));
			else
				System.out.printf(cart.get(i) + "\t\t$%6.2f\n", prices.get(i));
		}
	} //ends method
	public static void getTotal(ArrayList<Double> prices) //begins getTotal method to show user's total
	{
		System.out.println(" ");
		System.out.println("-------------------------------");
		double total = 0.0;
		for(int i = 0; i < prices.size(); i++) 
		{
			
			total += prices.get(i); 
		}
		total = total + (total * .0825);
		System.out.printf("Total + tax:\t\t$%6.2f\n", total );
	
			
	} //ends method
	public static void clearArrays(ArrayList<String> cart, ArrayList<Double> prices) //begins clearArrays method to empty arrays
	{
		cart.clear();
		prices.clear();
	} //ends method

} //ends class
