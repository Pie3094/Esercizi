import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAmount;
import java.util.Locale;

public class Main { //  Esempi lezione
    public static void main(String[] args) {
        // ISO8601 Default
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00Z");
        OffsetDateTime data1 = OffsetDateTime.now();
        OffsetDateTime data2 = OffsetDateTime.of(2023, 3, 1, 13, 0, 0, 0, ZoneOffset.UTC);
        System.out.println(data);
        System.out.println(data1);
        System.out.println(data2);

        OffsetDateTime ieri = OffsetDateTime.parse("2002-02-01T11:00Z");
        System.out.println(ieri);

        OffsetDateTime primoGennaio = OffsetDateTime.of(2023, 1, 1, 15, 15, 0, 0, ZoneOffset.UTC);
        System.out.println(primoGennaio);

        // Parte 2 - Formattazione
        String dataStringF = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dataStringL = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        String dataStringM = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dataStringS = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        //      String timeStringF = data.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL));
        //    String timeStringL = data.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG));
        String timeStringM = data.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
        //  String timeStringS = data.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));

        String dateTimeStringM = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT));

        String dateTimeStringManual = data.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy"));
        // Info sul come, in seguito:
        /* https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html */
        String dateTimeStringManual2 = data.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy", Locale.ITALY));
        String dateTimeStringManual3 = data.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy", Locale.ENGLISH));

        String dataStringIso = data.format(DateTimeFormatter.ISO_DATE_TIME);
        String dataStringIso2 = OffsetDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);


        System.out.println("Full: " + dataStringF);
        System.out.println("Long: " + dataStringL);
        System.out.println("Medi: " + dataStringM);
        System.out.println("Shor: " + dataStringS);
        System.out.println("Time: " + timeStringM);
        System.out.println("DaTi: " + dateTimeStringM);
        System.out.println("Manual: " + dateTimeStringManual);
        System.out.println("ManualItalian: " + dateTimeStringManual2);
        System.out.println("ManualEnglish: " + dateTimeStringManual3);
        System.out.println("ISO: " + dataStringIso);
        System.out.println("Now ISO: " + dataStringIso2);
        
    }
}