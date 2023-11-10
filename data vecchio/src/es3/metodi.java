package es3;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class metodi {


    public static int getYear(OffsetDateTime data) {
        int data1 = data.getYear();
        return data1;
    }

    public static Month getMonth(OffsetDateTime data) {
        Month data1 = data.getMonth();
        return data1;
    }

    public static int getDayOfMonth(OffsetDateTime data) {
        int data1 = data.getDayOfMonth();
        return data1;
    }

    public static DayOfWeek getDayOfWeek(OffsetDateTime data) {
        DayOfWeek data1 = data.getDayOfWeek();
        return data1;
    }
}
