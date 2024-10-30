import java.util.Scanner;

public class PartA {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        //ask the user their age (as integer)
        System.out.print("Enter age of customer (as an integer): ");
        int age = in.nextInt();
        
        //ask user if it's a Monday
        System.out.print("Is it Monday? (y/n): ");
        String reply = in.next();

        // make it lowercase.
        reply = reply.toLowerCase();

        //check if it's a Monday?
        double discount = 0;
        if (reply.equals("y")) {
            if(age < 13) {
                discount = 0.075;
            } else if (age >= 50) {
                discount = 0.15;
            } else {
                discount = 0.05;
            }
        } else {
            //it's not a monday
            if(age < 13) {
                discount = 0.05;
            
            } else if(age>= 50) {
                discount = 0.075;
            }
        }
        //print the discount to the screen
        System.out.printf("The discount equals %.2f%n", discount);
    }

}