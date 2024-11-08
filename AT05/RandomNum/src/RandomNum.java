import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {

        Random randomnum = new Random();

        int num_times = 100;
        for (int i = 0; i < num_times; i++) {
            int j = randomnum.nextInt(100);
            System.out.print(j);
        }
        }
    }
