package linkedhashset;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class settoarray 
{
public static void main(String [] args)
{
System.out.println("creating a set");
Set<Integer> set = new LinkedHashSet<Integer>();
set.add(10);
set.add(20);
set.add(30);
set.add(40);
set.add(50);
set.add(60);
set.add(70);
System.out.println("Converting list into array");

//Integer[] it = set.toArray(new Integer[0]);
Integer it = new Integer(set.size());
set.toArray();
for(Integer s : set)
{
	System.out.println(s);
}
}
}
