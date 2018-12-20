

public class Card
{
private int value;
private String suit;

public Card(int a, String s)
{
value = a;
suit = s;
}

public void setValue(int x) {value = x;}
public int getValue() {return value;}
public void setSuit(String s) { suit = s;}
public String getSuit() { return suit;}

public String mediaName()
{
return suit + "-" + value;
}

public String toString() 
{ 
String name;
if(value == 1)
  name = "Ace";
else if(value == 11)
  name = "Jack";
else if(value == 12)
  name = "Queen";
else if(value == 13)
  name = "King";
else
  name = ""+value;

return name + " of " + suit;
}


}