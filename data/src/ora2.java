import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class ora2 {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String data2 = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println(data2);
    }
}
