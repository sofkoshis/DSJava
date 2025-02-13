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

    public static void main(String[] args) {
        Tally c = new Tally();
    System.out.println("count = " );
    
        
    }
    
}
