package es4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ora4 {
    public static void main(String[] args) {

        System.out.println(metodi.plusYear());
        System.out.println(metodi.minusMont());
        System.out.println(metodi.plusDay());
        System.out.println(metodi.formatterItaly(Locale.ITALIAN));
        System.out.println(metodi.formatterEnglish(Locale.ENGLISH));
    }


}
