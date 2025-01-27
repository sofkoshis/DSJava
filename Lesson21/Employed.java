import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Employed {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "Top5Unemployment.txt";
        
        System.out.println("---------------------------------------------------------------");
        System.out.printf("                 Top 5 Unemployment Rates                        ");
        System.out.println("---------------------------------------------------------------");

        try(Scanner scanner = new Scanner(new File(file))) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(","); //youtube

                String country = parts[0].trim();
                double unemploymentRate = Double.parseDouble(parts[1].trim());
                int rank = Integer.parseInt(parts[2].trim());
                String region = parts[3].trim();
                System.out.printf("Ranked #%2d: %-15s | %6.2f%% | %-20s/n ", rank, country, unemploymentRate, region);

            }
        }
    
        
              System.out.println("---------------------------------------------------------------");
    }

    
}




        
    
    

