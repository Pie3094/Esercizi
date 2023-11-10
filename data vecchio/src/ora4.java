import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ora4 {
    public static void main(String[] args) {
        OffsetDateTime ora = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime ora1 = ora.plusYears(1);
        OffsetDateTime ora2 = ora.minusMonths(1);
        OffsetDateTime ora3 = ora.plusDays(7);
        String ora4 = ora.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        String ora5 = ora.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH));
        // String dateTimeStringManual2 = data.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy", Locale.ITALY));

        System.out.println(ora1);
        System.out.println(ora2);
        System.out.println(ora3);
        System.out.println(ora4);
        System.out.println(ora5);
    }
}
