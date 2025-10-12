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

String[] str =list.toArray(new String[0]);
System.out.println(Arrays.toString(str));

}
}
