import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class DateAndTimeInJava8 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(Instant.now());
        Instant timeStampString = Instant.parse("2021-07-09T04:13:14.587169278Z");
        System.out.println(timeStampString.getEpochSecond());

        Instant twoHourFromNow = Instant.now().plus(2, ChronoUnit.HOURS);
        System.out.println(twoHourFromNow);

        System.out.println(twoHourFromNow.until(timeStampString,ChronoUnit.HOURS));

        LocalDate localDate = LocalDate.now();
        Period period = Period.of(localDate.getDayOfYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        System.out.println(period);


     //   LocalDateTime localDateTime = LocalDateTime.of(2018,3,44,14,20,670);
        Duration fromLocalDate = Duration.ofMinutes(100);
        System.out.println(fromLocalDate);
    }
}
