import java.util.Scanner;

public class Handle {
    public static int getQuizScore(Scanner in) {
        System.out.print("Enter a quiz score from 0-100: ");
        int score = in.nextInt();

        if(score < 0 || score > 100) {
            throw new ArithmeticException("the score must be from 0-100");

        }
        return score;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int score = getQuizScore(in);
            System.out.println(score);
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
            
        }
    }
}