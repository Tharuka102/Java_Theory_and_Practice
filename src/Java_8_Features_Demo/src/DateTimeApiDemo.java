package Java_8_Features_Demo.src;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeApiDemo {

    public static void main(String[] args) {
        // Java 8 introduced a modern date and time API in java.time.
        LocalDate today = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Today's date  : " + today);
        System.out.println("Current time  : " + currentTime);
        System.out.println("Date and time : " + now);

        LocalDate nextWeek = today.plusDays(7);
        System.out.println("After 7 days  : " + nextWeek);
    }
}
