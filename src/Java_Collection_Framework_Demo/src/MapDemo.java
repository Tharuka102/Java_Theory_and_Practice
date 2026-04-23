package Java_Collection_Framework_Demo.src;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {
        // HashMap stores data as key-value pairs.
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Nimal");
        studentMap.put(2, "Kamal");
        studentMap.put(3, "Sunil");

        System.out.println("HashMap: " + studentMap);

        // TreeMap keeps keys in sorted order.
        Map<String, Integer> marks = new TreeMap<>();
        marks.put("Math", 90);
        marks.put("English", 85);
        marks.put("Science", 95);

        System.out.println("TreeMap: " + marks);
    }
}
