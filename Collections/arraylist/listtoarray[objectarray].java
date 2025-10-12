package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class listtoarrayobj 
{
public static void main(String [] args)
{
List list = new ArrayList();
list.add("messi");
list.add(10);
list.add(10.2);
list.add(10.2f);
list.add(100l);

System.out.println("original list : " +list);
System.out.println("convert this list into object array");

//Object[] obj = list.toArray(new Object[0]);
//System.out.println(Arrays.toString(obj));


Object[] obj = new Object[list.size()];
list.toArray(obj);
for(Object oiu : list)
{
System.out.println(oiu);	
}
}
}
