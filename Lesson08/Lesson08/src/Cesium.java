public class Cesium {
    public static void main(String[] args) {
        double amount = 100; //initial amount of cesium
        int years = 0;

        //loop until amount is less then or equal to 1;
        while (amount >1) {
            // increase number of years by the half life
            years = years + 30;

            //decrease the amount of cesium by half
            amount = amount/2.0;
        }
// print results
System.out.printf("After %d years, the amount left is equal to %.2f%n" , years, amount);
    }
}
