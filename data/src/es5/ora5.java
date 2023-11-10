package es5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

public class ora5 {
    public static void main(String[] args) {

        System.out.println(metodi.isBefore("2023-03-01T13:00:00Z", "2024-03-01T13:00:00Z"));
        System.out.println(metodi.isAfter("2023-03-01T13:00:00Z", "2024-03-01T13:00:00Z"));
        System.out.println(metodi.isEqualToday("2023-03-01T13:00:00Z", "2024-03-01T13:00:00Z"));
    }

}