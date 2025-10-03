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
name.clear();
System.out.println(name);
}
}


clear() is used to clear all the elements and the list becomes empty
