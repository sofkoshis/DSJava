import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Exception {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true) {
            System.out.print("Please enter a file name or '#' to quit: ");
            String filename = in.nextLine();

            if(filename.equals("#")) {
                System.out.println("Goodbye!");
                break;
            }

            try {
                File som = new File(filename);
                Scanner filScanner = new Scanner(som);

                while(filScanner.hasNext()) {
                    String word = filScanner.next();
                    System.out.println(word);
                }
            } catch (FileNotFoundException exception) {
                System.out.println("File not found");
            
            } 
            }
        }
    }
