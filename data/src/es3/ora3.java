package es3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.OffsetDateTime;

public class ora3 {
    public static void main(String[] args) {
        OffsetDateTime data1 = metodi.parsed("2023-03-01T13:00:00Z");
        System.out.println(metodi.getYear(data1));
        System.out.println(metodi.getMonth(data1));
        System.out.println(metodi.getDayOfMonth(data1));
        System.out.println(metodi.getDayOfWeek(data1));

    }
}
