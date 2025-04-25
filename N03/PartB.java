import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.DataFormatException;

public class PartB {
    public static void main(String[] args) {
        String filepath = "data.bin";
        ArrayList<Employee> employees = new ArrayList<>();

        try(FileInputStream in = new FileInputStream(filepath);
        DataInputStream data = new DataInputStream(in);) {
            int lastID = data.readInt();
            Employee.lastIDUsed = lastID;

            while (true) {
                try {
                    Employee e = new Employee();
                    e.readFromStream(data);
                    employees.add(e);
                    e.displayInfo();


                } catch (EOFException e) {
                    break;
                } catch (IOException e) {
                    System.err.println("IOexception occurred.");
                    break;
                }
                
            }


        } catch (IOException e) {
            System.err.println(e.getMessage());
        }



    }
}
