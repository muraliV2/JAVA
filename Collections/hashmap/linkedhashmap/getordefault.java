package linkedhashmap2;

import java.util.LinkedHashMap;
import java.util.Map;

public class getordefault 
{
public static void main(String [] args) 
{
Map<String, Integer> map = new LinkedHashMap<String, Integer>();
map.put("murali",234);
map.put("Ronaldo",7);
map.put("messi",30);

System.out.println(map.getOrDefault("murali", 0));

}
}
