
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Text {

public static void main(String[] args) {
ArrayList<Integer> numbers = new ArrayList<Integer>();
int lowest_temp = Integer.MAX_VALUE;


try {
      FileReader reader = new FileReader("temps.txt");
      Scanner fileScanner = new Scanner(reader);

while(fileScanner.hasNextInt()) {
     int number = fileScanner.nextInt();
     numbers.add(number);
     if (number < lowest_temp) {
      lowest_temp = number;
     }
}
reader.close();
fileScanner.close();
System.out.println("The temperatures are: " + numbers);

for ( int number : numbers ) {
      if (number == lowest_temp) {
            System.out.println(number + "<=lowest");
      } else {
            System.out.println(number);
      }
      }




  } catch (FileNotFoundException e) { // learned about this catch 
      // excpetion on youtube
      e.printStackTrace();
  } catch (IOException e) {
      e.printStackTrace();
  } 

}
}
