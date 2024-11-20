import java.util.Scanner;
public class PartB {
    public static void main(String[] args) {
        //create scanner object.
        Scanner in = new Scanner(System.in);

        //prompt them for a phrase
        System.out.print("Enter a phrase: ");
        String phrase = in.nextLine();

        //make phrase all lower case.
        phrase = phrase.toLowerCase();
        //loop and count the number of e's
        int count = 0;
        for(int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'e') {
                count = count + 1;
            }
        }
        //print the number of e's.
        System.out.printf("There are %d e's in your phrase.%n" , count);
    }
}
