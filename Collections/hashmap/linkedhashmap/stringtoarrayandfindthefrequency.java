package linkedhashmap2;

import java.util.LinkedHashMap;
import java.util.Map;

public class findthefrequencyofcharacter 
{
public static void main(String [] args)
{
String s1 = "hello world";

Map< Character, Integer> map = new LinkedHashMap<Character, Integer>();

for(Character ch : s1.toCharArray())
{
	if(ch !=' ')
	{
		map.put(ch, map.getOrDefault(ch, 0)+1);
	}
}
System.out.println(map);

}
}
