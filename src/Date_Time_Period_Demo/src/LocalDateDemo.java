package Date_Time_Period_Demo.src;

import java.time.LocalDate;

public class LocalDateDemo {

    public static void main(String[] args) {
        // LocalDate stores only the date without time.
        LocalDate today = LocalDate.now();

        // Create a specific date.
        LocalDate customDate = LocalDate.of(2026, 4, 18);

        System.out.println("Today's date  : " + today);
        System.out.println("Custom date   : " + customDate);

        // Add and subtract days.
        System.out.println("After 5 days  : " + today.plusDays(5));
        System.out.println("Before 2 days : " + today.minusDays(2));
    }
}
