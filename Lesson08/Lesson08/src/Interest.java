import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        //Create scanner object to get user input
    Scanner in = new Scanner(System.in);

    //prompt user for interest rate.
    System.out.print("Enter the APR (for example 6.5 for a 6.5% APR): ");
    double apr = in.nextDouble();

    // prompt the user initial investment balance.
     System.out.print("Enter the initial balance: ");
    double balance = in.nextDouble();

    //print the table header
    System.out.println("Year |        Int Earned ($)       |           Balance ($)\r\n" + //
                "");
    System.out.println("----------------------------------------------------------------------\r\n");

    // do a for loop and loop 5 times or five years.
    double interest = 0;
    for (int i =0; i < 5; i++) {
        //calculate interest.
        interest = balance * apr/ 100.0;

        //update balance.
        balance = balance + interest;

        //print results
        System.out.printf("%5d %29.2f %29.2f%n", i + 1, interest, balance);
    }


    }
}
