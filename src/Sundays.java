import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class Sundays {

        public static void main(String[] args) {
            // Create a LocalDate object that represent the first day of the year.
            int year = 2022;
            LocalDate now = LocalDate.of(year, Month.AUGUST, 1);
            // Find the first Sunday of the year
            LocalDate sunday = now.with(firstInMonth(DayOfWeek.SUNDAY));

            Month Month;
            do {
                // Loop to get every Sunday by adding Period.ofDays(7) to the current Sunday.
                System.out.println(sunday.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
                sunday = sunday.plus(Period.ofDays(7));
            } while (sunday.getMonth() == Month);
        }
    }

