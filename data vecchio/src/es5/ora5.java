package es5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class ora5 {
    public static void main(String[] args) {
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        System.out.println(metodi.isBefore(data1, data2));
        System.out.println(metodi.isAfter(data1, data2));
        System.out.println(metodi.isEqualToday(data1, data2));
    }

}


//        System.out.println("data 1 è precedente a data 2? " + data1.isBefore(data2));
//        System.out.println("data 2 è successiva a data 1? " + data2.isAfter(data1));
//        System.out.println("data 1 e data 2 sono uguali alla data odierna? " + data1.isEqual(OffsetDateTime.now()) + " " + data2.isEqual(OffsetDateTime.now()));