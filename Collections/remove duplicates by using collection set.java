package hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import laptop.asus;

public class findduplicateinarray 
{
public static void main(String [] args)
{
	int[] arr = {10,20,30,40,50,60,70,0,200,10,20};
	
	//if we want to remove the duplicate in array we need to make use of collections set
	
	
	Set<Integer> set  = new HashSet<Integer>();
	for(int th : arr)
	{
		set.add(th);
		
	}
	System.out.println(set);
	
	// convert set into array
	
	Integer[] arr1 = set.toArray(new Integer[0]);
	
	System.out.println(Arrays.asList(arr1));
	
}
}
