package collection;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

import collections.arraylist;

public class listiterateelement 
{
public static void main(String [] args)
{
System.out.println("creating arraylist");
List list = new ArrayList();
list.add("hello");
list.add(10);
list.add(null);
list.add(10.3);
list.add(10.5f);
list.add(20l);
System.out.println(list);
System.out.println("-----------------------");
System.out.println("using iterate element using for each loop");

for(Object obj : list)
{
System.out.println(obj+"");	
}
}
}
