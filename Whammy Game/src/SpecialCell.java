
public class SpecialCell extends Cell{
private double multiplier;

	public SpecialCell(int x, double y) { //sets values and extends the superclass Cell
		super(x);
		multiplier = y;
		
		
	}
	public void setMultiplier(int x){ //setter for class
	multiplier = x;	
	}
	public double getMultiplier(){ //getter for class
		return multiplier;
	}
	public int getValue(){ //over rides the getValue() method for cell
		int x = super.getValue() * (int)multiplier;
		System.out.println("The value would normally be: " + super.getValue() + " but because of a multiplier of " + multiplier + " the value added is $" + x);
		return x;
	}
	public String toString(){ //what the system will print out for Cells
		return "The Value would normally be " + super.getValue() + " but because of the multiplier " + multiplier + " the value to be added is " + getValue();
	}

}
