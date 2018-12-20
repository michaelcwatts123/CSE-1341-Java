import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
public class Board {
	private static ArrayList<Cell> cells = new ArrayList<Cell>(); //stores cell values
	public Board(){ //fills cell array list with values
		File dataFile = new File("CellValues.txt");
		ArrayList<Integer> test = new ArrayList<Integer>();
		try {
			
			Scanner input = new Scanner(dataFile);
		
		while(input.hasNextLine()){ //reads in the values and stores them in an array
			
			input.useDelimiter(" "); //splits the string at " "
			String s = input.nextLine();
			
			int x = Integer.parseInt(s); //converts the string into an int
			test.add(x); //adds it to the array
		}
		//creates all needed cells and special cells
		cells.add(new Cell(test.get(0)));
		cells.add(new SpecialCell(test.get(1), test.get(2)));
		cells.add(new Cell(test.get(3)));
		cells.add(new Cell(test.get(4)));
		cells.add(new SpecialCell(test.get(5),test.get(6)));
		cells.add(new Cell(test.get(7)));
		cells.add(new Cell(test.get(8)));
		cells.add(new Cell(test.get(9)));
		cells.add(new SpecialCell(test.get(10), test.get(11)));
		cells.add(new Cell(test.get(12)));
		cells.add(new Cell(test.get(13)));
		cells.add(new SpecialCell(test.get(14), test.get(15)));
		cells.add(new Cell(test.get(16)));
		cells.add(new Cell(test.get(17)));
		cells.add(new Cell(test.get(18)));
		cells.add(new Cell(test.get(19)));
		cells.add(new Cell(test.get(20)));
		cells.add(new Cell(test.get(21)));
	
		} catch (Exception e) { //catches if there is an error with the file
			System.out.println("oops");
			
		}
		}
	
public static int spin(){ //spins for arraylist value
	Random r = new Random();
	int x = r.nextInt(18);
	Cell y = cells.get(x);
	int z = y.getValue();
	return z;
}
}

