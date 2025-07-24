import java.time.LocalDate;
@FunctionalInterface
interface DateManipulator {
    LocalDate change(LocalDate date);
}
public class DateAdjust {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2025, 7, 23);
        DateManipulator addDays = d -> d.plusDays(10);
        DateManipulator subtractMonths = d -> d.minusMonths(2);
        LocalDate after10Days = addDays.change(today);
        LocalDate before2Months = subtractMonths.change(today);
        System.out.println("Original Date: " + today);
        System.out.println("After adding 10 days: " + after10Days);
        System.out.println("After subtracting 2 months: " + before2Months);
    }
}