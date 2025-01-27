
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File data = new File("characters.txt");
        int totalCharacters = 0;
        int letterCount = 0;
        int digitCount = 0;
        try(Scanner in = new Scanner(data)) {
            while(in.hasNext()) {
                String line = in.nextLine();
                System.out.println(line);

                for(char lin : line.toCharArray()) {
                    totalCharacters++;
                    if(Character.isLetter(lin)) {
                        letterCount++;
                    } else if(Character.isDigit(lin)) {
                        digitCount++;
                    }
                }
            }
        }
        
        System.out.println("count = " + totalCharacters);
        System.out.println("letters = " + letterCount);
        System.out.println("digits = " + digitCount);
    }
    
}
