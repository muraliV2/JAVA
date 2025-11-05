package linkedhashmap2;

import java.util.LinkedHashMap;
import java.util.Map;

public class arrayfreqency 
{
public static void main(String [] args)
{
int[] arr = {10,20,30,40,50,60,70,10,20,30,40};

Map<Integer, Integer> map = new LinkedHashMap<Integer,Integer> ();

for(int i : arr)
{
map.put(i, map.getOrDefault(i, 0)+1);	
}
for(Map.Entry<Integer, Integer> entry : map.entrySet())
{
if(entry.getValue() > 1)
{
System.out.println(entry.getKey());	
}
}

}
}
