public class List {
    public static void main(String[] args) {

        double[] numbers = {2.2,1.0,3.7,4.1,88.0};

        double value = 0;

        for (double num : numbers  ) {
            System.out.println(num);
            value += num;
        }

        double average = value / numbers.length;
        System.out.println("The average is: " + average);
    } 
}