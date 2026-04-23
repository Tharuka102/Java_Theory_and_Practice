package Functional_Interfaces_Lamda_StreamAPI_Demo.src;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Nimal", "Kamal", "Sunil", "Amal");

        // Lambda makes iteration shorter and cleaner.
        names.forEach(name -> System.out.println("Name: " + name));
    }
}
