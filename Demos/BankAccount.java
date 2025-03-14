import java.util.ArrayList;

public class BankAccount implements Measurable {
    private int id;
    private double balance;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        String s = this.getClass().getName()
                + String.format(" [ID = %04d, balance = $%,9.02f]", id, balance);
        return s;
    }

    public static double calcAvg(ArrayList<BankAccount> list) {
        double sum = 0;
        if (list.size() == 0) {
            return 0;
        }

        for (BankAccount account : list) {
            sum = sum + account.getBalance();
        }

        return sum / list.size();

    }
    public double getMeasure() {
        return getBalance();
    }
    @Override
    public int compareTo(BankAccount) {
        final double SMALL_NUMBER
    }
}