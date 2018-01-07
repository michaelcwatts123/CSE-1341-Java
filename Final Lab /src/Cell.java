
public class Cell {
private int value; //value of spin
public Cell(int x){
	value = x; //sets a default value
}
public void setValue(int x){
	value = x; //sets value to value of spin
}
public int getValue(){
	return value; //returns value
}
public String toString(){
	String s;
	if (value == -1){
		s = "Whammy"; //prints Whammy if value is -1
	}
	else
		s = "$" + getValue(); //otherwise just prints value
	return s;
}
}
