import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class PartB {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("birthyears.txt"));
while (in.hasNextLine()) {
    String line = in.nextLine();
    String[] parts = line.split(",");

    String name = parts[0];
    String birth = parts[1];

    try {
        int year = Integer.parseInt(birth);
        System.out.println(name + " was born in " + year + ".");
    } catch (NumberFormatException exception) {
        System.out.println("I don't know the birth year of that person.");
    }
}

        } catch (FileNotFoundException exception) {
            System.out.println("file not found");
        }
    }
}



