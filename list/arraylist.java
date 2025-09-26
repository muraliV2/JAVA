package list;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

public class Creating_List {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        System.out.println("Inserting elements");

        list.add("python");
       // list.add(1995);
        //list.add('f');
        list.add("java");
        //list.add(22.4);

        System.out.println(list);
    }
}
