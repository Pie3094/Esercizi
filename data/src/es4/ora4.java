package es4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ora4 {
    public static void main(String[] args) {
        OffsetDateTime ora = OffsetDateTime.parse("2023-03-01T13:00:00Z");
//        OffsetDateTime es1ù.ora1 = ora.plusYears(1);
//        OffsetDateTime es2.ora2 = ora.minusMonths(1);
//        OffsetDateTime es3.ora3 = ora.plusDays(7);
//        String es4.ora4 = "2023-03-01T13:00:00Z";
//        String es5.ora5 = ora.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH));
//        // String dateTimeStringManual2 = data.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy", Locale.ITALY));

//        System.out.println(es1ù.ora1);
//        System.out.println(es2.ora2);
//        System.out.println(es3.ora3);
//        System.out.println(es4.ora4);
//        System.out.println(es5.ora5);
        System.out.println(metodi.plusYear(ora));
        System.out.println(metodi.minusMont(ora));
        System.out.println(metodi.plusDay(ora));
        System.out.println(metodi.formatterItaly(ora));
        System.out.println(metodi.formatterEnglish(ora));
    }


}
