// Save the following program as WaterBill.java // Import any needed package(s)// Start the WaterBill class   // Start the main method// Declare and assign local variables for gallons used iGallons = 0 // For Standard Cost dStandardCost = 0.0// For Excess Cost dExcessCost = 0.0// And for the Total Cost dTotal = 0.0// Similar to program 1, use the =\t character to print the header line with// Gallons, Standard Cost, Excess Cost, Total/*Using the same values that were used in Lab01’s spreadsheet, calculate the Standard and Excess costs based on the gallons used. Add the costsfor the Total cost.Print the row of information after making the calculations*/   //End main method// End classpublic class WaterBill 
{
public static void main(String[] args)
{
int iGallons = 0;
double dStandard = 0.0;
double dExcessCost = 0.0; 
double dTotal = 0.0;
iGallons = 5000;
System.out.println("Gallons \t Standard Cost \t Excess Cost \t Total");
for (int counter = 1; counter <= 12; counter ++)
{
if (iGallons > 10000)
{
	dStandard = 10000/20.0;
	dExcessCost = ((iGallons - 10000))/ 10.0;
	dTotal = dStandard + dExcessCost;
	System.out.printf("%d \t\t %06.2f \t %6.2f \t %7.2f \n", iGallons, dStandard, dExcessCost, dTotal);
	
}
else
{
	dStandard = iGallons/20.0;
	dTotal = dStandard;
	dExcessCost = 0.0;
	System.out.printf("%d \t\t %6.2f \t %6.2f \t %7.2f \n", iGallons, dStandard, dExcessCost, dTotal);
	
}

if (iGallons < 10000)
	iGallons += 5000;
else
	iGallons += 500;


}
}
}