public class Inverted {

    public static void printRow(int n) {
    if (n == 1) {
        System.out.printf("*\n");
    } else {
        System.out.printf("*");
        printRow(n-1);
    }
}
    
    public static void printInverted(int n) {
       if(n> 0) {
        printRow(n);
        printInverted(n-1);
       }
    }
    
    public static void main(String[] args) {
      printInverted(5);

    } 
}

