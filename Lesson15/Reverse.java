/*Sofia Koshy
 * Java w/ Mr. Eng
 */
import java.util.Arrays;
import java.util.Scanner; 

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SIZE =10;
        int[] numbers = new int[SIZE];
        int currentSize = 0;

        System.out.println("Enter up to 10 integer values, type q to quit.");
        //forever loop.
        while (true) {
            //check if they typed q
            if(in.hasNext("q") || in.hasNext("Q")) {
                //consume the current item in the scanner.
                in.next();
                //done with input
                System.out.println("Done wiht input.");
                break;
            } 
            // let's assume they type in an integer.
            int value = in.nextInt();

            //is there space in out array?
            if (currentSize < numbers.length) {
                numbers[currentSize] = value;
                currentSize = currentSize + 1;
            } else {
                //ran out of space.
                System.out.println("No more space in the array!");
                break;
            }
        }

        //loop through array and print values.

    
   
    for (int i = 0; i < currentSize; i++) {
        System.out.print("*" + numbers[i]);
    }

   System.out.println("*");

   // sort the data.
   Arrays.sort(numbers, 0,currentSize);
   

   // loop through the array starting at the end.
   for(int i = currentSize - 1; i >=0; i--) {
    System.out.print(numbers[i]);
    if (i>0) {
        System.out.print(",");
    }
    }
    System.out.println();

    
        
        
    }
    }



