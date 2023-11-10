package es5;

import java.time.OffsetDateTime;

public class metodi {
    public static String isBefore(OffsetDateTime data, OffsetDateTime data2){
        boolean before = data.isBefore(data2);
        return "Data 1 (" + data + ") è antecedente alla data 2 (" + data2 + ")? " + before;
    }
    public static String isAfter(OffsetDateTime data, OffsetDateTime data2){
        boolean after = data2.isAfter(data);
        return "Data 2 (" + data2 + ") è successiva alla data 1 (" + data + ")? " + after;
    }
    public static String isEqualToday(OffsetDateTime data, OffsetDateTime data2){
        OffsetDateTime today = OffsetDateTime.now();
        boolean equal = data.isEqual(today) && data2.isEqual(today);
        return "Data 1 (" + data + ") e data 2? (" + data2 + ") sono uguali alla data odierna? ("+ today + ") = " + equal;
    }
}
