package linkedhashmap2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class iterator 
{
public static void main(String [] args)
{
Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
map.put(1, 10);
map.put(2, 20);
map.put(3, 30);
map.put(4, 40);
map.put(5, 50);
map.put(6, 60);
map.put(7, 70);

System.out.println("iterator");
Set set = map.entrySet();
Iterator itr = set.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());	
}
}
}
