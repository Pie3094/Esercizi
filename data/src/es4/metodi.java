package es4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class metodi {
    public static OffsetDateTime parsed() {
        return OffsetDateTime.parse("2023-03-01T13:00:00Z");
    }

    public static OffsetDateTime plusYear() {
        return parsed().plusYears(1);
    }

    public static OffsetDateTime minusMont() {
        return parsed().minusMonths(1);
    }

    public static OffsetDateTime plusDay() {
        return parsed().plusDays(1);
    }

    public static String formatterItaly(Locale local) {
        return parsed().format(DateTimeFormatter.ofPattern("dd MMMM yyyy").localizedBy(local));
    }

    public static String formatterEnglish(Locale local) {
        return parsed().format(DateTimeFormatter.ofPattern("dd MMMM yyyy").localizedBy(local));
    }
}
