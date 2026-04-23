package Java_8

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeApiDemo {

    public static void main(String[] args) {
        // Java 8 introduced the new Date and Time API in java.time package.
        LocalDate today = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Today's date : " + today);
        System.out.println("Current time : " + currentTime);
        System.out.println("Date and time: " + now);

        // Example: adding days to a date
        LocalDate nextWeek = today.plusDays(7);
        System.out.println("Date after 7 days: " + nextWeek);
    }
}
