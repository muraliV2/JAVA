package linkedhashset1;

import java.util.LinkedHashMap;
import java.util.Map;

public class findthefirstnonrepeatedvalueinastring{
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(str);

        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count character frequency
        for (char c : str.toCharArray()) {
            if (c != ' ') { // ignore spaces
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println(map);

        // Find first non-repeated character
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First Non-Repeating Character: " + entry.getKey());
                break;
            }
        }
    }
}
