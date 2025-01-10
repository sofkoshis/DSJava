
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
//I am not sure how to get this to work I
//watch a lot of videos and used stack
//I will come in during AB

public class Quizzes {

public static void main(String[] args) {
ArrayList<Integer> scores = new ArrayList<Integer>();



try {
      FileReader reader = new FileReader("quizzes.txt");
      Scanner fileScanner = new Scanner(reader);

while(fileScanner.hasNextInt()) {
     int score = fileScanner.nextInt();
     scores.add(score);
     for(int i =0; i <scores.size(); i++) {
       System.out.println("Quiz " + scores.get(i) + ":"+ score);
       int arraySize = scores.size();
       int average = (score/arraySize);
       System.out.println("The average of the scores is"+ average);
 
     }
     }

reader.close();
fileScanner.close();




  } catch (FileNotFoundException e) { // learned about this catch 
      // excpetion on youtube
      e.printStackTrace();
  } catch (IOException e) {
      e.printStackTrace();
  } 

}
}
