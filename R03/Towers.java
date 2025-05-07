public class Towers {
    public static void main(String[] args) {
          
        int numberOfDiscs = 3;
        int startPeg = 1;
        int endPeg = 3;
        System.out.println("Moves to solve Towers of Hanoi with " + numberOfDiscs + " discs:");
        hanoi(numberOfDiscs, startPeg, endPeg);
    }
    
    public static int getInterim(int start, int end) {
        return 6 - start - end;
    }
 
    public static void printMove(int start, int end) {
        System.out.println(start + "-->" + end); 
    }
    public static void hanoi(int n, int start, int end) {
        if (n == 1) {
            printMove(start, end);
        } else {
            int interim = getInterim(start, end);
            hanoi(n-1, start, interim);
            printMove(start, end);
            hanoi(n-1, interim, end);
        }

      
        
    }
}


    
