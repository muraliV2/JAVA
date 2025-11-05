package linkedhashmap2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class findthefrequency 
{
public static void main(String [] args)
{
String s1 = "hello hello world how are you";


String[] words = s1.split(" ");
for(String s : words)
{
	System.out.println(s);
}
Map<String,Integer> map = new LinkedHashMap<String, Integer>();
for(String s : words)
{
	map.put(s,map.getOrDefault(s,0)+1);
}
System.out.println(map);
}
}
