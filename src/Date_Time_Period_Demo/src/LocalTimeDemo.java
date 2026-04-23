package Date_Time_Period_Demo.src;

import java.time.LocalTime;

public class LocalTimeDemo {

    public static void main(String[] args) {
        // LocalTime stores only the time without date.
        LocalTime currentTime = LocalTime.now();

        // Create a fixed time value.
        LocalTime meetingTime = LocalTime.of(10, 30, 15);

        System.out.println("Current time  : " + currentTime);
        System.out.println("Meeting time  : " + meetingTime);

        // Add hours and minutes.
        System.out.println("Plus 2 hours  : " + meetingTime.plusHours(2));
        System.out.println("Minus 15 mins : " + meetingTime.minusMinutes(15));
    }
}
