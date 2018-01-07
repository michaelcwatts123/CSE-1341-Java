import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
public class HighLow extends JFrame
{
JButton deckButton, dealButton, card1Button, card2Button, higherButton, lowerButton;
JLabel scoreLabel;
Card card1;
Card card2;
int score = 0;
Deck theDeck = new Deck();
public HighLow(){
super("High Low Game");
setLayout(new FlowLayout());
MyInner mi = new MyInner();
deckButton = new JButton(getIcon("ShuffleBack"));
add(deckButton);
deckButton.addActionListener(mi);

dealButton = new JButton("Deal");
add(dealButton);
dealButton.addActionListener(mi);
card1Button = new JButton(getIcon("blank"));
add(card1Button);

higherButton = new JButton("Higher?");
add(higherButton);
higherButton.addActionListener(mi);
lowerButton = new JButton("Lower?");
add(lowerButton);
lowerButton.addActionListener(mi);
card2Button = new JButton(getIcon("blank"));
add(card2Button);

add(new JLabel("Score: "));

scoreLabel = new JLabel("" + score);
add(scoreLabel);

}
private class MyInner implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == deckButton)
			{
				theDeck.shuffle();
				playSound("shuffle");
				deckButton.setIcon(getIcon("card-back"));
				
			}
		if (e.getSource() == dealButton)
			{
				card1 = theDeck.drawCard();
				playSound("deal");
				String filename = card1.mediaName();
				card1Button.setIcon(getIcon(filename));
				dealButton.setEnabled(false);
				higherButton.setEnabled(true);
				lowerButton.setEnabled(true);
				card2Button.setIcon(getIcon("blank"));
				
			}
		if (e.getSource() == higherButton)
			{
				card2 = theDeck.drawCard();
				String filename = card2.mediaName();
				card2Button.setIcon(getIcon(filename));
				if (card1.getValue() < card2.getValue())
					{
						score++;
						scoreLabel.setText("" + score);
						playSound("ding");
					}
				else if(card1.getValue() > card2.getValue())
					{
						score--;
						scoreLabel.setText("" + score);
						playSound("buzzer");
					}
				dealButton.setEnabled(true);
				higherButton.setEnabled(false);
				lowerButton.setEnabled(false);
					
			}
		if (e.getSource() == lowerButton)
			{
				card2 = theDeck.drawCard();
				String filename = card2.mediaName();
				card2Button.setIcon(getIcon(filename));
				if (card1.getValue() > card2.getValue())
					{
						score++;
						scoreLabel.setText("" + score);
						playSound("ding");
					}
				else if(card1.getValue() < card2.getValue())
					{
						score--;
						scoreLabel.setText("" + score);
						playSound("buzzer");
					}
				dealButton.setEnabled(true);
				higherButton.setEnabled(false);
				lowerButton.setEnabled(false);
					
			}
	}
}
public void playSound(String s){
try{
File sound = new File("media/" + s + ".wav");
Clip theClip = AudioSystem.getClip();
theClip.open(AudioSystem.getAudioInputStream(sound));
theClip.start();
}
catch(Exception e)
{
System.out.println("Sound file error");
}
}
public ImageIcon getIcon(String s)
{
	ImageIcon icon = new ImageIcon();
	try
	{
		File imageFile = new File("media/" + s + ".jpg");
		Image img1 = ImageIO.read(imageFile);
		icon = new ImageIcon(img1);
	}
	catch (Exception e){
	System.out.println("Error loading image");
	}
return icon;
}
public static void main(String[] args)
{
HighLow game = new HighLow();
game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
game.setSize(900,250);
game.setVisible(true);
}
}