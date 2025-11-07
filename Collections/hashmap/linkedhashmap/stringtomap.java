package linkedhashmap2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class stringtomap 
{
public static void main(String [] args)
{
String s1 = "murali hello world";


String[] word = s1.split(" ");
Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

for(char c : s1.toCharArray())
{
if(c!=' ')
{
map.put(c,map.getOrDefault(c, 0)+1);	
}

}
System.out.println(map);
}
}
