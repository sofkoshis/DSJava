import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        double total = 0;   //the total numberof valid test score points.
        int count = 0;      //the number of valid test scores that were entered.
// create Scanner object.
Scanner in = new Scanner(System.in);
        //loop forever.
        while (true) {
            //prompt the user for a  test score.
            System.out.print("Enter a test score (greater than or equal to sero or a negative value to exit:)");
            double score = in.nextDouble();

            //do they want to quit?
            if (score < 0) {
                break;
            } else {
                // we have a valid score that we have ot count.
                total = total + score;
                count = count + 1;
            }
            }
// print the results.
if (count > 0) {
    double average = 0;
    if ( count > 0) {
        average = total / count;
        System.out.printf("The average score for %d tests is %.2f%n" , count, average);
    } else {
System.out.println("No scores were entered.");
    }
}

        }
    }

