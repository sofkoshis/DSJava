import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "sales_by_cat.txt";
        try(Scanner scanner = new Scanner(new File(file))) {
            System.out.printf("%-15s | %10s |%10s%n", "Department", "Manager", "Revenue");
            System.out.println("---------------------------------------------------------------");
            while(scanner.hasNextLine()) {

                String line = scanner.nextLine();
                String[] parts = line.split(",\\s"); //youtube

                if(parts.length != 3) {
                    continue;
                }

                String department = parts[0];
                String manager = parts[1];
                String sales  = parts[2];
                double revenue = sales.equals("n/a")? 0.0 : Double.parseDouble(sales);
                System.out.printf("%-15s | %10s |%10s%n", department, manager,revenue);
            }
        }

    }
}


