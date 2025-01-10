/* Sofia Koshy
 * Java with Mr. Eng
 * 01/06/2024
 */
import java.util.ArrayList;
import java.util.Scanner;
public class PartC {
    public static void main(String[] args) {
        
ArrayList<Integer> numbers = new ArrayList<Integer>();
int lowest_temp = Integer.MAX_VALUE;

 Scanner in = new Scanner(System.in);

 
  System.out.println("Give a temperature: ");
  int[] response = new int[in.nextInt()];

while(in.hasNextInt()) {
  
     int number = in.nextInt();
     numbers.add(number);

     if (number < lowest_temp) {
      lowest_temp = number;
     }
}

System.out.println("The temperatures are: " + numbers);

for ( int number : numbers ) {
      if (number == lowest_temp) {
            System.out.println(number + "<=lowest");
      } else {
            System.out.println(number);
      }
      }
    }
}
         
        