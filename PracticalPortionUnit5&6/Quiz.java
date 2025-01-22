import java.util.ArrayList;
import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) { 
Scanner in = new Scanner(System.in);
ArrayList<Double> scores = new ArrayList<>();


while (true) {
    System.out.print("Enter a quiz score or 'q' to quit: ");
if(in.hasNextDouble()) {
    double values = in.nextDouble();
    scores.add(values);
} else {
    String input = in.next();
    if(input.equalsIgnoreCase("q")) {
        break;
    
}
}
System.out.println("/n");
double total =0;
for(double score : scores) {
    System.out.printf("%6.2f%n", score);
    total+=score;
}
double average = total/scores.size();
System.out.printf("/nAverage Score: %6.2f%n", average);
    }
}
}


