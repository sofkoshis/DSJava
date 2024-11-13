/* Sofia Koshy
 * AT Java with Mr. Eng
 * 11/13/2024
 */

import java.util.Scanner; 

public class AT03BB {
    static public void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //ask for phone number
    String phoneNumber;
    System.out.print("Enter a 10 digit phone number (no spaces): ");
    phoneNumber = in.next();

    String newNumber;
    newNumber = "(" + phoneNumber.substring(0,3) + ")" + phoneNumber.substring(3,5) + "-" + phoneNumber.substring(6);
    System.out.println("The formatted number is " + newNumber);
    }
}

