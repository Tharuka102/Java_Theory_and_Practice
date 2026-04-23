package Java_8_Features_Demo.src;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        String title = "Java 8 Features";
        String missingTitle = null;

        // Optional helps us handle possibly missing values safely.
        Optional<String> safeTitle = Optional.ofNullable(title);
        Optional<String> safeMissingTitle = Optional.ofNullable(missingTitle);

        System.out.println("Available title : " + safeTitle.orElse("Default Title"));
        System.out.println("Missing title   : " + safeMissingTitle.orElse("Default Title"));

        safeTitle.ifPresent(value -> System.out.println("Length of title: " + value.length()));
    }
}
