public class PartB {
    static int[][] grape = {
              { 8, 6, 7 },
              { 5, 3, 0 }
    
};
static int[][] berry = {
        { 0, 7, 6, 5 },
        { 2, 2, 0, 1 },
        { 8, 4, 5, 7 }

};



public static void main(String[] args) {
    System.out.println("First array: ");
    print(grape);
    System.out.println("Second array: ");
    print(berry);

}
public static void print(int[][] values) {
    for (int i = 0; i<values.length;i++) {
        for(int j = 0; j<values[i].length;j++) {
    System.out.print(values[i][j] + (j < values[i].length - 1 ? ", " : ""));
        
       
    }
    System.out.println();
}
}
}
