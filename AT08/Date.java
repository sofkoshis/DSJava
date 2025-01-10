import java.time.LocalDate;
import java.time.LocalTime;

public class Date {
    public static void main(String[] args) {
        LocalDate todays_date = LocalDate.now();

        LocalTime current_time = LocalTime.now();

        System.out.println("Today's date is " + todays_date);
        System.out.println("The time is " + current_time);
    }
}