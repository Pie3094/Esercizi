package es5;

import java.time.OffsetDateTime;

public class metodi {
    public static OffsetDateTime parse(String data) {
        return OffsetDateTime.parse(data);
    }

    public static String isBefore(String data, String data2) {
        boolean before = parse(data).isBefore(parse(data2));
        return "Data 1 (" + data + ") è antecedente alla data 2 (" + data2 + ")? " + before;
    }

    public static String isAfter(String data, String data2) {
        boolean after = parse(data).isBefore(parse(data2));
        return "Data 2 (" + data2 + ") è successiva alla data 1 (" + data + ")? " + after;
    }

    public static String isEqualToday(String data, String data2) {
        OffsetDateTime today = OffsetDateTime.now();
        boolean equal = parse(data).isEqual(parse(data2));
        return "Data 1 (" + data + ") e data 2? (" + data2 + ") sono uguali alla data odierna? (" + today + ") = " + equal;
    }
}
