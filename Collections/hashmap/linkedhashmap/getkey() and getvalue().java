package linkedhashmap2;

import java.util.LinkedHashMap;
import java.util.Map;

public class getkey_getvale 
{
public static void main(String [] args)
{
Map< Character, Integer> map = new LinkedHashMap<Character, Integer>();
map.put('A', 10);
map.put('B', 20);
map.put('C', 30);
map.put('D', 40);
map.put('E', 50);
map.put('F', 60);
map.put('G', 70);

System.out.println(map);

for(Map.Entry<Character, Integer> entry : map.entrySet())
{
System.out.println(entry.getValue() + "  " + entry.getKey());	
}
}
}
