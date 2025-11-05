package linkedhashmap2;
import java.util.LinkedHashMap;
import java.util.Map;

public class stringfirstfrequency 
{
public static void main(String [] args)
{
	String str = "my name is murali";
	
	Map<Character, Integer> map =  new LinkedHashMap<Character,Integer>();
	
	String[] words = str.split(" ");
	
	for(Character c : str.toCharArray())
	{
		map.put(c,map.getOrDefault(c, 0)+1);
	
	}
	System.out.println(map);
}
}
