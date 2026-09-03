package secao11_dateTime.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeBasics {
    public static void main(String[] args) {

        System.out.println("Current date");
        LocalDate localDate01 = LocalDate.now();
        System.out.println(localDate01);
        System.out.println();

        System.out.println("Current date and time");
        LocalDateTime localDateTime01 = LocalDateTime.now();
        System.out.println(localDateTime01);
        System.out.println();

        System.out.println("Instant (time zone GMT)");
        Instant instant01 = Instant.now();
        System.out.println(instant01);
        System.out.println();

        System.out.println("Date in the format ISO 8601");
        LocalDate localDate02 = LocalDate.parse("2026-08-11");
        System.out.println(localDate02);
        System.out.println();

        System.out.println("Date and hour in the format ISO 8601");
        LocalDateTime localDateTime02 = LocalDateTime.parse("2026-08-11T20:21:12");
        System.out.println(localDateTime02);
        System.out.println();

        System.out.println("Time zone GMT");
        Instant instant02 = Instant.parse("2026-08-11T20:30:47-03:00");
        System.out.println(instant02);
        System.out.println();

        System.out.println("Date formated");
        LocalDate localDate03 = LocalDate.parse(
                "11/08/2026",
                DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(localDate03);
        System.out.println();

        System.out.println("Date and hour formated");
        LocalDateTime localDateTime03 = LocalDateTime.parse(
                "11/08/2026 20:44",
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(localDateTime03);
        System.out.println();

        System.out.println("Date with isolated data");
        LocalDate localDate04 = LocalDate.of(2026, 8, 11);
        System.out.println(localDate04);
        System.out.println();

        System.out.println("Date and hour with isolated data");
        LocalDateTime localDateTime04 = LocalDateTime.of(2026, 8, 11, 20, 52);
        System.out.println(localDateTime04);
        System.out.println();

    }
}
