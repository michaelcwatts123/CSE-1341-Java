import javax.swing.JFrame;
public class GameLauncher{
   public static void main(String[] args){
     WhammyGui game = new WhammyGui(); //begins new instance of GUI
game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets default values
    game.setSize(600,400);
    game.setVisible(true);
   }
}
