package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listtoarray 
{
public static void main(String [] args)
{
List list = new ArrayList<>();
list.add(10);
list.add("messi");
list.add("barca");
System.out.println("convert list into object array");

Object[] objArray = list.toArray();
System.out.println(Arrays.toString(objArray));
}
}


the object array can store both homogeneous and heterogeneous 
