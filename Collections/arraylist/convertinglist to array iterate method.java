package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listtoarray 
{
public static void main(String [] args)
{
List<String>list = new ArrayList<>();
list.add("messi");
list.add("neymar");
list.add("mbappe");
System.out.println("convert list into object array");

String[] str =new String[list.size()];
list.toArray(str);
for(String sfr : list)
{
	System.out.println(sfr);
}



}
}
so we are converting list to array and printing the elements which is present inside the list one by one by using iterate method
