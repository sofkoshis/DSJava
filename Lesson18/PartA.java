/* Sofia Koshy
 * Java with Mr. Eng
 * 01/06/2024
 * Used java tutorials on youtube
 * and geeks for geeks website for
 * all Parts
 */
import java.util.ArrayList;
import java.util.Scanner;
public class PartA {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<String>();
         Scanner in = new Scanner(System.in);
         
        


        while (true) {
        System.out.print("Enter a name or # to quit:" );
        String a = in.nextLine();

        if (a.equals("q")) {
            System.out.println("Bye!");
            break;
        }
        names.add(a);
        System.out.println("Added:" + a);
        for (String name : names) {
        System.out.printf("%s%n", name);

        }
    }
}
} 



    
    


