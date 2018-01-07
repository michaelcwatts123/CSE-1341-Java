import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
public class WhammyGame {
	boolean check = false;
	Board b = new Board(); //creates a board
	ArrayList<Player> names = new ArrayList<>(); //stores players
	public WhammyGame(){
	
	}
	public String playGame(){ //begins game
		Scanner input = new Scanner(System.in);
		String gameResults = "Let's Play!\n";
		/*
		try {
		System.out.print("How many players: "); 
		int x = input.nextInt();
		for (int c = 1; c <= x; c++){ //fills array with players
			System.out.print("What is the player" + c +"'s name: ");
			names.add(new Player(input.next()));
		}
		}
		catch (Exception e){
			System.out.println("Error. You did not enter a valid number. Java encountered a input mismatch error. Goodbye!");
		}
		*/
		int c = 0;
		while ( true){ //loops through array until win conditions are met
		for (int a = 0; a < names.size(); a++){
			if (names.get(a).getMoney() < 10000){
				System.out.println(names.get(a).getName() + "'s Turn");
				names.get(a).takeTurn(b);
				 if (names.get(a).getMoney() > 10000){
					 System.out.print(names.get(a).getName() +" Won! with $" + names.get(a).getMoney());
					 gameResults += names.get(a).getName() + " Won! with $" + names.get(a).getMoney() + "\n";
					 c = 1;
					 PrintWriter pw;
						try {
							pw = new PrintWriter("GameResults.txt"); //Selects the output file
							pw.println("Number of Players: " + names.size()); //writes the number of players to the output file
							for (int i = 0; i < names.size(); i++){
								pw.println("Player: " + names.get(i)); //writes the scores to the output file
								gameResults += "Player " + names.get(i) + "\n";
							}
							pw.close(); //closes the file to make it readable
						} catch (Exception e) { //catches if there is an error
							System.out.print("Oops something went wrong");
						}
					 break; 
				 }
			}
			//else {
				//System.out.print(names.get(a).getName() +" Won! with $" + names.get(a).getMoney());
				
				
			//}
		}
		if (c == 1)
			break;
		}
		return gameResults;
		
}
	public String addPlayer(String s){ //adds players to player arraylist
		   Player p = new Player(s);
		   names.add(p);
		   return p.toString();
		}
}
