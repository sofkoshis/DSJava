import java.util.Random;
public class PartC {
    public static void main(String[] args) {
    //create a random number generator.
     Random rnd = new Random();


    int numIterations = 100;
    double total = 0;
    for (int i = 0; i < numIterations; i ++) {
    //generate a random number from 1-10.
    //nextInt gives a number form the low up to 
    //but not including the high.
        int r = rnd.nextInt(1,11);

// print number
        System.out.println(r);

        //update our total.
        total = total + r;
    }
    //calculate average.
    //The average approah 5.5 as numIterations gets bigger.
    //his is because 1 +10 = 11, 2 + 9 =11, and so on. divide 11 by 2 = 5.5
    double average = total /numIterations;

    //print results
    System.out.printf("average = %.2f%n" , average);
    }
}