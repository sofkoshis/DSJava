/* Sofia Koshy
 * AT CompSci with Mr. Eng
 * 11/15/2024
 */
public class MethodA{

    //make a method to find the smallest of the 3 doubles.
    public static double smallest(double x, double y, double z) {
        double smallest = x;

        if (y<smallest) {
            smallest = y;
        }
        if (z < smallest) {
            smallest = z;
        }
                return smallest;
    }


 public static void main (String[] args) {
    double first = 7.5;
    double second = 2.2;
    double third = 5.9;
    
    double result = smallest(first,second,third);
    System.out.printf("The smallest of %f, %f, %f is: %f", first , second, third,  result);
}
}
    

