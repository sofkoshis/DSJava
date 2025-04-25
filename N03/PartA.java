import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<>();
        while(true) {
            System.out.print("Type 'e' for employee or 'q' to quit: ");
            String token = in.nextLine();
            System.out.println(token);
            if(token.toLowerCase().equals("q")) {
                break;
            } else {
                System.out.print("Last name: ");
                String last = in.nextLine();
                System.out.print("First name: ");
                String first = in.nextLine();
                System.out.print("Salary: ");
                double salary = 0;
                try {
                    token = in.nextLine();
                    salary = Double.parseDouble(token);

                } catch (InputMismatchException e) {
                    System.err.println("Error");
                    System.err.println("Using 0 as default");
                }
                System.out.println();
                Employee.lastIDUsed++;
                Employee e = new Employee(last, first, Employee.lastIDUsed, salary);
                employees.add(e);
            }

        }
        //Record to file
        String filepath = "data.bin";
        try (
            FileOutputStream fileOutputStream = new FileOutputStream(filepath);
            DataOutputStream dataOutputStream = new DataOutputStream (fileOutputStream);
            ) {
                dataOutputStream.writeInt(Employee.lastIDUsed);
                for (Employee e : employees) {
                    e.writeToStream(dataOutputStream);
                } 
            } catch ( Exception e) {
                System.out.println("an error occurred.");
            }

    }
    
}
