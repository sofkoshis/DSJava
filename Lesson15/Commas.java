
    /*Sofia Koshy
 * Java w/ Mr. Eng
 */

import java.util.Scanner; 

public class Commas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numbers = new int[20];
        int currentSize = 0;

        System.out.println("Enter up to 20 integer values, type q to quit.");

        while (currentSize < numbers.length) {
            System.out.print("Enter a number: ");
            if(in.hasNextInt()) {
                numbers[currentSize] = in.nextInt();
                currentSize++;
            } else if (in.next().equals("q")) {
                in.next(); //do this
                System.out.println("Bye!");
                break;
            }
         
           
        }


// displaying the array.
for (int i = 0; i < currentSize; i++) {
    System.out.print(numbers[i]);
    if (i <currentSize - 1) {
        System.out.print (",");
    }
    }
    System.out.print("enter a number:");
    if (in.nextInt() == 1) {
        int count = 0;
        int target = in.nextInt();
        for(int i = 0; i < currentSize; i++) {
            if (numbers[i] == target) {
                count++;
            }
        }
        System.out.println("The value" + target + "happens" + count + "times in your number set");
        
    }
} 
}
