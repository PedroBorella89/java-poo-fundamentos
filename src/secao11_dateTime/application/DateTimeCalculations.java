package secao11_dateTime.application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCalculations {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.parse("2026-08-13");
        LocalDateTime localDateTime = LocalDateTime.parse("2026-08-13T20:07:26");
        Instant instant = Instant.parse("2026-08-13T20:07:26Z");

        System.out.println("Past week");
        LocalDate localDate1 = localDate.minusDays(7);
        System.out.println(localDate1);
        System.out.println();

        System.out.println("Next week");
        LocalDate localDate2 = localDate.plusDays(7);
        System.out.println(localDate2);
        System.out.println();

        System.out.println("Plus hours");
        LocalDateTime localDateTime2 = localDateTime.plusHours(3);
        System.out.println(localDateTime2);
        System.out.println();

        System.out.println("Minus minutes");
        LocalDateTime localDateTime3 = localDateTime.minusMinutes(30);
        System.out.println(localDateTime3);
        System.out.println();

        System.out.println("Past days");
        Instant instant1 = instant.minus(3, ChronoUnit.DAYS);
        System.out.println(instant1);
        System.out.println();

        System.out.println("Next hours");
        Instant instant2 = instant.plus(5, ChronoUnit.HOURS);
        System.out.println(instant2);
        System.out.println();

        // Duration
        LocalDate t1 = LocalDate.parse("2026-08-28");
        LocalDate t2 = LocalDate.parse("2026-09-11");
        LocalDate t5 = LocalDate.parse("2027-12-30");

        System.out.println("Duration days");
        Long days = ChronoUnit.DAYS.between(t1, t2);
        System.out.println(days + " days");
        System.out.println();

        System.out.println("Duration years");
        Long years = ChronoUnit.YEARS.between(t1, t5);
        System.out.println(years + " years");
        System.out.println();

        LocalDateTime t3 = LocalDateTime.parse("2026-08-13T10:00:00");
        LocalDateTime t4 = LocalDateTime.parse("2026-08-14T15:00:00");

        System.out.println("Duration hours");
        Duration duration2 = Duration.between(t3, t4);
        System.out.println(duration2.toHours() + " hours");
        System.out.println();

        Instant instant3 = Instant.parse("2026-08-13T10:00:00Z");
        Instant instant4 = Instant.parse("2026-08-14T15:00:00Z");

        System.out.println("Duration seconds");
        Duration duration3 = Duration.between(instant3, instant4);
        System.out.println(duration3.toSeconds() + " seconds");
        System.out.println();

    }
}
