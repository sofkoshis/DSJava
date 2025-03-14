import java.util.ArrayList;
import java.util.Collections;

public class DemoInterface {
    public static void main(String[] args) {
    Animal a1 = new Animal("Bessie", 1000);
        Animal a2 = new Animal("Bob", 1500);
        Animal a3 = new Animal("Charlie", 500);
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(a1);
         animals.add(a2);
        animals.add(a3);

        System.out.println("Bfore sorting: " + animals);
        Collections.sort(animals);
        System.out.println("After sorting: " + animals);
        System.out.println("Comparing " + a1.getName() + " and " + a2.getName() + ": " + a1.compareTo(a2));
        System.out.println("Comparing " + a2.getName() + " an " + a3.getName() + ": " + a2.compareTo(a3));
        System.out.println("Average animal weight = " + Animal.calcAvg(animals));
    }
}
