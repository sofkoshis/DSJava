public class PartB {

    public static void printRow(int n) {
    if (n == 1) {
        System.out.printf("*\n");
    } else {
        System.out.printf("*");
        printRow(n-1);
    }
}
    
    public static void printTriangle(int n) {
       if(n> 0) {
        printTriangle(n-1);
        printRow(n);
        
       }
    }
    
    public static void main(String[] args) {
    
      printTriangle(5);

    } 
}

