import java.util.ArrayList;
import java.util.Random;

public class Deck
{
private ArrayList<Card> cards = new ArrayList<Card>();
private int position = 0;

public Card drawCard()
{
Card c = cards.get(position);
position++;
if(position == 51)
  position = 0;
return c;
}

public Deck()
{

String[] suits = {"hearts","clubs","diamonds","spades"};

for(int c = 0; c < suits.length ; c++)
{
  String aSuit = suits[c];
  for(int x = 1; x <= 13; x++)
  {
    String fileName = aSuit + "-" + x;
    Card aCard = new Card(x,aSuit);
    cards.add(aCard);
  }
}
}//end constructor

public void shuffle()
{
Random r = new Random();
for(int x = 0; x < 52; x++)
{
  int y = r.nextInt(52);
  Card tempCard = cards.get(x);
  Card randomCard = cards.get(y);
  cards.set(x,randomCard);
  cards.set(y,tempCard);
  
}


}

public String toString()
{
 String s = "DECK:\n";
 for(int i = 0; i < cards.size(); i++)
   s = s + cards.get(i) + "\n";
 return s;
}



}