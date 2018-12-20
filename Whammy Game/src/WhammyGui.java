import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.JButton;
public class WhammyGui extends JFrame{
	WhammyGame game = new WhammyGame(); //starts an instance of the game
	int x = 0; //player counter
	JButton newGame, addPlayer, Play; //needed parts of interface
	JTextField player;
	JTextArea playerList;
	JLabel playerName;
	public WhammyGui() { 
		super("Whammy!");
		MyInner mi = new MyInner(); //button click checker
	setLayout(new FlowLayout()); //sets layout
	playerName = new JLabel("Player Name");
	newGame = new JButton("New Game");
	add(newGame);
	newGame.addActionListener(mi);
	add(playerName);
	player = new JTextField(20);
	add(player);
	addPlayer = new JButton("Add Player");
	addPlayer.setEnabled(false);
	add(addPlayer);
	addPlayer.addActionListener(mi);
	playerList = new JTextArea(20,30);
	
	add(playerList);
	Play = new JButton("Play");
	Play.setEnabled(false);
	add(Play);
	Play.addActionListener(mi);
}
	private class MyInner implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{ //checks what button is pressed
			if (e.getSource() == newGame){
				newGame.setEnabled(false);
				addPlayer.setEnabled(true);
				playerList.append("New Game! \n"); //new game message
				
			}
			if (e.getSource() == addPlayer){
				x++;
				if (x > 1) //checks if amount of players is greater than one
					Play.setEnabled(true);
				String s = player.getText();
				game.addPlayer(s);
				player.setText("");
				playerList.append("Added Player: " + s + " has $0\n");
			}
			if (e.getSource() == Play){
				String s = game.playGame(); //begins game
				playerList.append("Game Over!\n" + s); //ends game
				newGame.setEnabled(true); //resets to intial conditions
				addPlayer.setEnabled(false);
				Play.setEnabled(false);
			}
		}
	}
	}

