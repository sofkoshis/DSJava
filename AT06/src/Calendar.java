/*Sofia Koshy
 * AT Java with Mr. Eng
 * 11/01/2024
 */
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Month;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        //get today
        LocalDate today = LocalDate.now();

        // get the current month.
        Month month = today.getMonth();

        //print our header.
        //start with the month
        System.out.println(month);
        //print mon, tue, etc.
        System.out.println("Mon Tue Wed Thu Fri Sat Sun ");

        //skip over until we get to the first of the month.
        //get the first of the month.
        LocalDate firstOfMonth = today.minusDays(today.getDayOfMonth()-1);

        //System.out.println(firstOfMonth.getDayOfWeek());
        //System.out.println(firstOfMonth.getDayOfWeek().getValue());

        //loop to print blank spaces to skip over the days of the week
        //until we get to the first of the month.
        for (int i = 1; i < firstOfMonth.getDayOfWeek().getValue(); i++) {
            //print four blank spaces.
            System.out.print("    ");
        }
        //loop through the days of the moth.
        for (int i = 1; i<= month.length(false); i++) {
            System.out.printf("%3d", i);
            if (i == today.getDayOfMonth()) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            //is i a Sunday?
            LocalDate d = firstOfMonth.plusDays(i-1);
            if (d.getDayOfWeek().getValue() == 7) {
                System.out.println();
            }
        }
        //print a final newline
        System.out.println();
    }
}


