package Date_Time_Period_Demo.src;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2002, 1, 15);
        LocalDate today = LocalDate.now();

        // Period measures the difference between two dates.
        Period age = Period.between(birthDate, today);

        System.out.println("Years  : " + age.getYears());
        System.out.println("Months : " + age.getMonths());
        System.out.println("Days   : " + age.getDays());
    }
}
