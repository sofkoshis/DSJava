public class PartA {
    public static void main(String[] args) {
    int firstNumber = 0;
    int count = 0;
        for(int n = 1; n <= 100; n++) {
    firstNumber += n;
        count++;
        }
       int average;
        average = firstNumber/count;
         System.out.print("The average is: " + average);
    }
}
