package collections;

import java.util.ArrayList;

public class arraylist 
{
public static void main(String [] args)
{
ArrayList<String> name = new ArrayList<>();
name.add("hello");
name.add("world");
name.add("dybala");
name.add("messi");
name.add("neymar");
name.remove(2);
if(name.contains("ronaldo"))
{
System.out.println("ronaldo is on the lsit");	
}
else
{
	
System.out.println("not on the list");}
}
}
