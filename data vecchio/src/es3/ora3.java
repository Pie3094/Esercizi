package es3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.OffsetDateTime;

public class ora3 {
    public static void main(String[] args) {
        OffsetDateTime ora = OffsetDateTime.parse("2023-03-01T13:00:00Z");
//        System.out.println(ora.getYear());
//        System.out.println(ora.getMonth());
//        System.out.println(ora.getDayOfMonth());
//        System.out.println(ora.getDayOfWeek());
        System.out.println(metodi.getYear(ora));
        System.out.println(metodi.getMonth(ora));
        System.out.println(metodi.getDayOfMonth(ora));
        System.out.println(metodi.getDayOfWeek(ora));

    }
}
