import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Balance {
    public static void main(String[] args) throws FileNotFoundException {
        File csv = new File("customerdata.txt");
        
        try (Scanner in = new Scanner(csv)) {
            in.useDelimiter("[,\\s]+"); //java tb

            System.out.println("---------------------------------------");
            System.out.printf("%6s | %10s | %15s%n", "ID", "Name", "Balance");
            System.out.println("---------------------------------------");

            while(in.hasNext()) {
                int id = in.nextInt();
                String name = in.next();
                double balance = in.nextDouble();
                System.out.printf("%d | %s | $%.2f%n", id, name, balance);


            }
        }
        
    }
}