package es4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class metodi {
    public static OffsetDateTime plusYear(OffsetDateTime ora) {
        ora = ora.plusYears(1);
        return ora;
    }

    public static OffsetDateTime minusMont(OffsetDateTime ora) {
        ora = ora.minusMonths(1);
        return ora;
    }

    public static OffsetDateTime plusDay(OffsetDateTime ora) {
        ora = ora.plusDays(1);
        return ora;
    }
    public static String formatterItaly(OffsetDateTime ora) {
        String ora1 = ora.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        return ora1;
    }
    public static String formatterEnglish(OffsetDateTime ora) {
        String ora1 = ora.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH));
        return ora1;
    }
}
