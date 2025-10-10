package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraytoarraylist 
{
public static void main(String [] args)
{
int[] arr = {10,40,30,20,45,50};	
List list = new ArrayList();
for(int o :arr)
{
	list.add(o);	
}

Collections.sort(list);

System.out.println(list);
}
}
