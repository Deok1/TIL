package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1);
        System.out.println("date = " + date);

        DayOfWeek firstDayOfWeek = date.getDayOfWeek();
        LocalDate lastDayOfWeek = date.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));

        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);
    }
}
