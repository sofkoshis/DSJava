/* Sofia Koshy
 * Java w/ Mr. Eng
 * I used stack overflow + youtube videos
 */
import java.util.Scanner;
 public class Quiz {
    public static void main (String[]args) {

        //make partially filled array
        double[] scores = new double[100];

        int count = 0;
        //Scan in quiz scores from user until they enter 'q' to quit
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            if (in.hasNextDouble()) {
                scores[count++] = in.hasNextDouble();


            } else if(in.next().equalsIgnoreCase('q')) {
                break;
            }
        }
        //Print scores
        System.out.println("The quiz scores are:" , (scores, count); );

        // ask user to drop lowest score
        System.out.println("Do you want to drop your lowest score? Type 'y' to do so");
        int index = 0;
        for(int i = 1; i<count; i++) {
            if(scores[i] < scores[index]) {
                index =i;
            }
        }

        //Keep the order of the other scores
        for (int i = index; i < count -1; i++) {
            scores[i] = scores[i+1];
        }

        //print scores after dropping the lowest
        System.out.println((scores, count));
    }
 }