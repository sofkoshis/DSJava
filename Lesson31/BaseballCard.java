public class BaseballCard {
    private String name; 
    private int year; 

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "BaseballCard{name='" + name + "', year=" + year + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseballCard that = (BaseballCard) obj;
        return year == that.year && name.equals(that.name);
    }

    public static void main(String[] args) {
        BaseballCard card1 = new BaseballCard("Babe Ruth", 1933);
        BaseballCard card2 = new BaseballCard("Babe Ruth", 1933);
        BaseballCard card3 = new BaseballCard("Jackie Robinson", 1952);

        System.out.println(card1); // Demonstrates toString()
        System.out.println(card2);
        System.out.println(card3);

        System.out.println("card1 equals card2: " + card1.equals(card2)); // true
        System.out.println("card1 equals card3: " + card1.equals(card3)); // false
    }
}
