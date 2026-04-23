package Java_Collection_Framework_Demo.src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        // ArrayList stores elements in insertion order and allows duplicates.
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("Java");

        System.out.println("ArrayList: " + arrayList);

        // LinkedList also stores ordered elements and supports fast insertions/removals.
        List<String> linkedList = new LinkedList<>();
        linkedList.add("One");
        linkedList.add("Two");
        linkedList.add("Three");

        System.out.println("LinkedList: " + linkedList);
    }
}
