import java.time.LocalDate;
import java.time.DayOfWeek;
@FunctionalInterface
interface DayOfWeekFinder {
    DayOfWeek getDay(LocalDate date);
}
public class DayOfWeekPrinter {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 12, 25);
        DayOfWeekFinder finder = d -> d.getDayOfWeek();
        DayOfWeek day = finder.getDay(date);
        System.out.println("Day of the week: " + day);
    }
}
