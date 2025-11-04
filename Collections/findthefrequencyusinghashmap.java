package linkedhashset1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class findthefrequence 
{
public static void main(String [] args)
{
String str = "Hello world";
String[] words = str.split("");
//System.out.println(Arrays.toString(words));

for(String s : words)
{
	System.out.println(s);
	}

Map<String, Integer> map = new LinkedHashMap<String, Integer>();


for(String word : words)
{
map.put(word,map.getOrDefault(map, +1));	
}
System.out.println(map);
}
}
