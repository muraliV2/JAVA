package linkedhashset1;

import java.util.LinkedHashMap;
import java.util.Map;

public class arraytostring 
{
public static void main(String [] args)
{
int[] arr = {10,20,30,40,50,20,30};
for(int i : arr)
{
System.out.println(i);
}

Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

for(int i : arr)
{
	map.put(i,map.getOrDefault(i,0)+1);
	
	}
System.out.println(map);
}
}
