package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class homogeneouslisttoarray 
{
public static void main(String [] args)
{
System.out.println("creating an list");
List<Integer> li = new ArrayList<Integer>();
li.add(10);
li.add(20);
li.add(30);
li.add(40);
li.add(50);
li.add(60);
li.add(70);
li.add(80);
li.add(90);
li.add(100);

System.out.println(li);
System.out.println("converting list to array");
//Integer[] inty = new Integer[li.size()];
//li.toArray(inty);
//for(Integer i : inty)
//{
//System.out.println(i);	
//}

Integer[] it = li.toArray(new Integer[0]);
System.out.println(Arrays.toString(it));

for(Integer io : it)
{
System.out.println(io);	
}
}
}
