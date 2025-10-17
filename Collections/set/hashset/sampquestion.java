package hashset;

import java.util.HashSet;
import java.util.Set;

public class hastsetcounrt 
{
public static void main(String [] args)
{
System.out.println("creating hashset");
Set<Integer> set = new HashSet<Integer>();
set.add(10);
set.add(20);	
set.add(30);	
set.add(40);	
set.add(50);	
set.add(50);	
set.add(60);	
set.add(70);	
set.add(80);	
set.add(90);	
set.add(100);
int count = 0;
for(Integer in : set)
{
count++;	
}
System.out.println("number of elemenets present in this set : " +count);
boolean empty = set.isEmpty();
if(empty)
{
System.out.println("collecton is empty");	
}
else
{
	
System.out.println("collection is not empty");}
}

}
