import java.util.Scanner;
public class PartD {
    public static void main(String[] args) {
        //create Scanner object.
        Scanner in = new Scanner(System.in);

        // ask user for number from 1 to 3999.
        System.out.print("Enter integer from 1 to 3999: ");

        // check if they entered an integer.
        int number = 0;
        if (in.hasNextInt()) {
            number = in.nextInt();
            
            //check to see if it's in the allowed range
            if (number<1 || number > 3999) {
                System.out.println("Error: only enter a value from 1-3999.");
                return;
            }
        } else {
            //they don't type in a number.
            System.out.println("Error: please enter an integer only. ");
            return;
        }
// Start of with blank String
        String numeral = "";

        //now we can process the number.
        //let's process the thousands.
        //how many thousands are there?
        int thousands = number / 1000;
        number = number % 1000;
        if (thousands == 3) {
            numeral = numeral + "MMM";
        } else if (thousands ==2) {
            numeral = numeral + "MM";
        
        } else if (thousands == 1) {
            numeral = numeral + "M";
        }
        
        //how many hundreds are there?
        int hundreds = number / 100;
        number = number % 100;
        if (hundreds == 9) {
            numeral = numeral + "CM";
        } if (hundreds == 8) {
            numeral = numeral + "DCCC";
        }if (hundreds == 7) {
            numeral = numeral + "DCC";
        }if (hundreds == 6) {
            numeral = numeral + "DC";
        }if (hundreds == 5) {
            numeral = numeral + "D";
        }if (hundreds == 4) {
            numeral = numeral + "CD";
        }if (hundreds == 3) {
            numeral = numeral + "CCC";
        }if (hundreds == 2) {
            numeral = numeral + "CC";
        }if (hundreds == 1) {
            numeral = numeral + "C";
        }
        //how many tens are there?
         int tens = number / 10;
        number = number % 10;
        if (tens == 9) {
            numeral = numeral + "XC";
        } if (tens == 8) {
            numeral = numeral + "LXXX";
        }if (tens == 7) {
            numeral = numeral + "LXX";
        }if (tens == 6) {
            numeral = numeral + "LX";
        }if (tens == 5) {
            numeral = numeral + "L";
        }if (tens == 4) {
            numeral = numeral + "XL";
        }if (tens == 3) {
            numeral = numeral + "XXX";
        }if (tens == 2) {
            numeral = numeral + "XX";
        }if (tens == 1) {
            numeral = numeral + "X";
        }
        //how many ones?
           int ones = number / 1;
        number = number % 1;
        if (ones == 9) {
            numeral = numeral + "IX";
        } if (ones == 8) {
            numeral = numeral + "VIII";
        }if (ones == 7) {
            numeral = numeral + "VII";
        }if (ones == 6) {
            numeral = numeral + "VI";
        }if (ones == 5) {
            numeral = numeral + "V";
        }if (ones == 4) {
            numeral = numeral + "IV";
        }if (ones == 3) {
            numeral = numeral + "III";
        }if (ones == 2) {
            numeral = numeral + "II";
        }if (ones == 1) {
            numeral = numeral + "I";
        }
         System.out.println("Your roman numeral is: "+ numeral);
    }

}
