package stack;
import java.util.Collections;
import java.util.Stack;

public class stackcreation 
{
public static void main(String [] args)
{
	Stack sta = new Stack();
	sta.add(10);
	sta.add(7);
	sta.add(24);
	sta.add(17);
	sta.add(69);
	sta.add(44);
	Collections.sort(sta,Collections.reverseOrder());
	System.out.println(sta);
	
}
}
