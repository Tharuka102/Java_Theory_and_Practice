package Date_Time_Period_Demo.src;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {

    public static void main(String[] args) {
        // LocalDateTime stores both date and time.
        LocalDateTime now = LocalDateTime.now();

        // Create a custom date-time value.
        LocalDateTime examDateTime = LocalDateTime.of(2026, 5, 10, 9, 0);

        System.out.println("Current date-time : " + now);
        System.out.println("Exam date-time    : " + examDateTime);

        // Modify year, month, hour, etc.
        System.out.println("After 1 week      : " + examDateTime.plusWeeks(1));
    }
}
