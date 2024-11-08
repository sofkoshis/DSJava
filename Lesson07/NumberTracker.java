import java.util.Scanner;

public class NumberTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double largest = Double.NEGATIVE_INFINITY;
        double smallest = Double.POSITIVE_INFINITY;
        double sum = 0;
        int count = 0;

        System.out.println("Enter numbers (or 'q' to quit):");

        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                double number = Double.parseDouble(input);
                if (number > largest) largest = number;
                if (number < smallest) smallest = number;
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry. Please enter a valid number.");
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.printf("Largest number: %.2f\n", largest);
            System.out.printf("Smallest number: %.2f\n", smallest);
            System.out.printf("Number of valid entries: %d\n", count);
            System.out.printf("Average of valid entries: %.2f\n", average);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        scanner.close();
    }
}
