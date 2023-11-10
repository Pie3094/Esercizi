import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjuster;
import java.util.Date;
import java.time.ZoneId;

public class ora1 {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String dataF = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dataM = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dataS = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(data);
        System.out.println(dataF);
        System.out.println(dataM);
        System.out.println(dataS);

    }
}
