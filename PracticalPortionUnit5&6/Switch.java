import java.util.Arrays;
public class Switch {
    public static void swap(int x, int y, int[] array) {
        if(x >= 0 && x < array.length && y >= 0 && y < array.length) {
            int value = array[x];
            array[x] = array[y];
            array[y] = value;
        }

    }
    public static void main(String[]args) {
        int [] numbers = {0,1,2,3,4,5,6,7,8,9};
        swap(2,7,numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
