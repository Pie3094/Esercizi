package es2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class metodi {
    public static String formatter(String date) {
        // OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        return parse(date).format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }

    public static OffsetDateTime parse(String date) {
        return OffsetDateTime.parse(date);
    }
}