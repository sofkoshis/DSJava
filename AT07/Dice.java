import java.util.Scanner;

public class Dice {
    private int number = 1;

    public int getNumber() {
        return number;
    }
        public void setNumber(int newNumber) {

    if (newNumber >= 1 && newNumber <=6) {
        number = newNumber;
    } else {
        
    }
}

public void roll() {
    double r = Math.random()* 6;
    number = (int) r + 1;
}

    public void display() {
        switch (number) {
        case 1: System.out.println("+-------+");
                System.out.println("|       |");
                System.out.println("|   O   |");
                System.out.println("|       |");
                System.out.println("+-------+");
                break;
        case 2: System.out.println("+-------+");
                System.out.println("| 0      |");
                System.out.println("|        |");
                System.out.println("|      0 |");
                System.out.println("+-------+");
                 break;
        case 3: System.out.println("+-------+");
                System.out.println("| o      |");
                System.out.println("|   O    |");
                System.out.println("|      o |");
                System.out.println("+-------+");
                 break;
        case 4: System.out.println("+-------+");
                System.out.println("| o    o  |");
                System.out.println("|        |");
                System.out.println("| 0     o |");
                System.out.println("+-------+");
                 break;
        case 5: System.out.println("+-------+");
                System.out.println("|o      o |");
                System.out.println("|   O     |");
                System.out.println("| o     o |");
                System.out.println("+-------+");
                 break;
        case 6: System.out.println("+-------+");
                System.out.println("| o    o  |");
                System.out.println("| O     o|");
                System.out.println("|o      o |");
                System.out.println("+-------+");
                 break;
        }

    }
    public static void main(String[] args) {
        Dice d = new Dice();
        Scanner in = new Scanner(System.in);
        String reply;
        boolean doLoop = true;
        while (doLoop) {
            System.out.print("Enter R to roll, D to display, Q to quit: ");
            reply = in.nextLine().toLowerCase();
            if(reply.equals("r")) {
                d.roll();
                System.out.println("The number is: " + d.getNumber());

            } else if (reply.equals("d")) {
                d.display();

            } else if (reply.equals("q")) {
                doLoop = false;
            }
        }
    }
}
