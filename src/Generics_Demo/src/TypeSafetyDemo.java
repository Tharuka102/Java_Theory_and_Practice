package Generics_Demo.src;

import java.util.ArrayList;
import java.util.List;

public class TypeSafetyDemo {

    public static void main(String[] args) {
        // Generic list ensures only String values are stored.
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        for (String name : names) {
            System.out.println("Name = " + name);
        }

        // names.add(100); // This would cause a compile-time error.
    }
}
