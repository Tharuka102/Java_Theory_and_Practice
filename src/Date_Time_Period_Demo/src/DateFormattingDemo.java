package Date_Time_Period_Demo.src;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormattingDemo {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        // Create a custom formatting pattern.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Format the date-time into a readable string.
        String formattedDateTime = now.format(formatter);

        System.out.println("Formatted date-time: " + formattedDateTime);
    }
}
