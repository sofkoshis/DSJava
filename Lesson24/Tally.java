import java.util.Scanner;
//i here is underlined I am not sure why
public class Tally {

    public void click() {
        count = count + 1; //or count++;
        if(count > MAX_COUNT) {
            count = 0;
        }

    }
    public int look() {
        return count;

    }
    public void reset() {
        count = 0;

    }
    /* Private member varaibles used to model the state of the object.
     * 
     */
    private int count = 0;
    private final int MAX_COUNT = 9999;

    }
   
    public static void main(String[] args) {
        Tally c = new Tally();
        Tally p = new Tally();
        Scanner in = new Scanner(System.in);
String input;
        while (true) {
            System.out.print("count: ");
            input = in.nextLine();

            if(input.equals("c")) {
                c.click();
                System.out.println("Cake vote: " + c.look());

            } else if (input.equals("p")) {
                p.click();
                System.out.println("Pie votes: " +p.look());

            } else if (input.equals("q")) {
                System.out.println("Cake vote: " + c.look());
                System.out.println("Pie votes: " + p.look());
                break;
            } else {
                System.out.println("Please entrer a valid character.");
            }


        }
 
}

