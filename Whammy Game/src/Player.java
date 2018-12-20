
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Player {
	private String name; //player name
	private int money; //player score
	public Player(String s){
		name = s; //Initial values
		money = 0;
	}
	public String getName(){
		return name; //returns player name
	}
	public void setName(String s){
		name = s; //sets player name
	}
	public int getMoney(){
		return money; //returns score
	}
	public void setMoney(int x){
		money = x; //sets score
	}
	public void postMoney(int x){ //method to post the players score
		if (x == -1){
			money = 0;
			System.out.println("Spun Whammy");
		}
		else {
			System.out.println("Spun " + x);
			money += x;
		}
	}
	public String toString(){ //method to print the players name and score
		return name + " has $" + money;
	}
	public void takeTurn(Board b){ //method to take a turn spinning in the game
		/*
		Scanner input = new Scanner(System.in);
		String response;
		while (true){
		System.out.printf(name + " has $" + money +"\n" + "Spin(Y/N)");
		response = input.next();
			if (response.equalsIgnoreCase("n"))
				break;
			else{
				int z = b.spin();
				postMoney(z);
				if (z== -1){
					break;
				}
				
			}
		}
		*/
		Scanner input = new Scanner(System.in); 
		System.out.println("\n" + name + "'s turn\n");  //pop up window to handle game
		while(true) {
			int result = JOptionPane.showConfirmDialog(null,name + " has $" + money + "\nSpin?", name,JOptionPane.YES_NO_OPTION);
			       if(result == JOptionPane.NO_OPTION)
			           break;
			       int cellValue = Board.spin();
			       postMoney(cellValue);
			       if(cellValue == -1) {
			JOptionPane.showMessageDialog(null,"WHAMMY!","Turn Over",JOptionPane.INFORMATION_MESSAGE);
			break; } else
			JOptionPane.showMessageDialog(null,"Hit $"+cellValue,"Money Cell!",JOptionPane.INFORMATION_MESSAGE);
			}
	}

}
