// Save the following program as WaterBill.java // Import any needed package(s)
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