package Java_8

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        String presentValue = "Java 8 Features";
        String missingValue = null;

        // Optional helps avoid direct null handling problems.
        Optional<String> optionalText = Optional.ofNullable(presentValue);
        Optional<String> emptyText = Optional.ofNullable(missingValue);

        System.out.println("Present value: " + optionalText.orElse("Default Value"));
        System.out.println("Missing value: " + emptyText.orElse("Default Value"));

        // ifPresent executes only when a value exists.
        optionalText.ifPresent(text -> System.out.println("Length: " + text.length()));
    }
}
