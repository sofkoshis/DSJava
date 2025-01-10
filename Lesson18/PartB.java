/* Sofia Koshy
 * Java with Mr. Eng
 * 01/06/2024
 * Part B:
Write a Java program that prompts the users for test scores:
Use an ArrayList to store the values as Double objects
If the user enters 'q' then quit inputting values
Loop through the elements in the ArrayList and print each element on a separate line with 2 decimal places of accuracy
Calculate and display the average of the scores

 */
import java.util.ArrayList;
import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        
        ArrayList<String> scores = new ArrayList<String>();
         Scanner in = new Scanner(System.in);
         
        


        while (true) {
        System.out.print("Enter a test score ('q' to quit)" );
        String score = in.nextLine();
      
        if (score.equals("q") || score.equals("Q")) {
            System.out.println("Bye!");
            break;
        }
        scores.add(score);
    }
    
    System.out.println("test scores:");
    for (String score : scores) {
        System.out.println(score);
    }
    if (scores.size() > 0) {
       int totalScores = scores.size();
       System.out.println();

       //How is this possible 
        }
    }
}

