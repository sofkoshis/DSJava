import java.util.Scanner;

public class DimLight {

    public boolean say = false;

    public int bright = 10;

    public boolean getSay() {
        return say;
    }

    public int getBright() {
        return bright;
    }
    public void up() {
        bright = bright +1;
        if (bright > 10) {
            bright = 10;
        }
    }

    public void down() {
        bright = bright -1;
        if( bright < 1) {
            bright = 1;
        }

    }
    public void on() {
        say = true;
    }
    public void off() {
        say = false;
    }
}