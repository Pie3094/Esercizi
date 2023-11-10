package es2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class metodi {
    public static String formatter(OffsetDateTime data) {
        String data1 = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        return data1;
    }
}
