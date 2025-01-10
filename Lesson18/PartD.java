import java.util.ArrayList;
import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer values. Type 'q' to quit:");

        while (true) {
            if (scanner.hasNextInt()) {

                int number = scanner.nextInt();
                numbers.add(number);
            } else {
              
                String input = scanner.next(); 

                if (input.equalsIgnoreCase("q")) {
                    break; 
                } else {
                    System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
                }
            }
        }

      
        numbers.removeIf(number -> number % 2 != 0);

        System.out.println("List(even numbers only):");
        for (int number : numbers) {
            System.out.println(number);
        }

        
    }
}
