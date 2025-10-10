package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortdesendingorder 
{
public static void main(String [] args)
{
List<Integer> list = new ArrayList<Integer>();
list.add(50);
list.add(1);
list.add(99);
list.add(67);
list.add(22);
System.out.println(list);
System.out.println("------------------");
System.out.println("going to sort the list by using collectons sort methods in reverse order");
Collections.sort(list,Collections.reverseOrder());
System.out.println(list);

}
}
