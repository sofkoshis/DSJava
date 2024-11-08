import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Give me an integer: ");
        int  firstNumber = in.nextInt();

        System.out.print("Give me a second integer: ");
        int  secondNumber = in.nextInt();

        System.out.print("Give me a third integer: ");
        int  thirdNumber = in.nextInt();

        double first, second, third;

        if (firstNumber > secondNumber && firstNumber > thirdNumber){
        first = firstNumber;
        if (secondNumber > thirdNumber) {
        second = secondNumber;
        third = thirdNumber;
        } else {
        second = thirdNumber;
        third = secondNumber;
        }
    } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
        first = secondNumber;
        if (firstNumber > thirdNumber) {
            second = firstNumber;
            third = thirdNumber;
        } else {
            second = thirdNumber;
            third = firstNumber;
        }
    } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
        first = thirdNumber;
        if (firstNumber > secondNumber) {
            second = firstNumber;
            third = secondNumber;
        } else {
            second = secondNumber;
            third = firstNumber;
        }
    
        System.out.println("Here are your numbers in decreasing order: " + first + " " + second + " " + third + " ");
    
    }


    }
}

    

