package es3;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class metodi {

    public static OffsetDateTime parsed(String data) {
        return OffsetDateTime.parse(data);
    }

    public static int getYear(OffsetDateTime data) {
        return data.getYear();
    }

    public static Month getMonth(OffsetDateTime data) {
        return data.getMonth();
    }

    public static int getDayOfMonth(OffsetDateTime data) {
        return data.getDayOfMonth();
    }

    public static DayOfWeek getDayOfWeek(OffsetDateTime data) {
        return data.getDayOfWeek();
    }
}
