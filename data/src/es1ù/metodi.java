package es1ù;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class metodi {
    public static OffsetDateTime data(OffsetDateTime data) {
        data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        return data;
    }

    public static String dataFull(OffsetDateTime data) {
        String data1 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        return data1;
    }

    public static String dataMedium(OffsetDateTime data) {
        String data1 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        return data1;
    }

    public static String dataShort(OffsetDateTime data) {
        String data1 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        return data1;
    }
}
