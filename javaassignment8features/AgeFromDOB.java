import java.time.LocalDate;
import java.time.Period;
@FunctionalInterface
interface AgeCalculator {
    Period calculate(LocalDate dob, LocalDate currentDate);
}
public class AgeFromDOB {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(1995, 5, 15);
        LocalDate today = LocalDate.now();
        AgeCalculator ageCalc = (birthDate, current) -> Period.between(birthDate, current);
        Period age = ageCalc.calculate(dob, today);
        System.out.println("Age is: " + age.getYears() + " years " +
                           age.getMonths() + " months " +
                           age.getDays() + " days");
    }
}
