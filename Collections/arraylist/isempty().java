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
if(name.isEmpty())
{
System.out.println("it has no content");	
}
else
{
System.out.println(name);	
}
}
}


isempty() is used to check if the array has content or empty
if it is empty returns true
if not returns false
