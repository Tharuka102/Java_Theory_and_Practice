package Java_Collection_Framework_Demo.src;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        // HashSet does not allow duplicate values.
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10);

        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet keeps insertion order and removes duplicates.
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("A");

        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}
