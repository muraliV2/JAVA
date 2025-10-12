package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listtoarray 
{
public static void main(String [] args)
{
List list = new ArrayList<>();
list.add('a');
list.add('b');
list.add('c');
System.out.println("convert list into object array");

Character[] objArray = new Character[list.size()];
list.toArray(objArray);
for(Character c : objArray)
{
System.out.println(c+" ");	
}
//System.out.println(Arrays.toString(objArray));
}
}
