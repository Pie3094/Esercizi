package es1ù;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjuster;
import java.util.Date;
import java.time.ZoneId;

public class ora1 {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(metodi.data(data));
        System.out.println(metodi.dataFull(data));
        System.out.println(metodi.dataMedium(data));
        System.out.println(metodi.dataShort(data));

    }

}
