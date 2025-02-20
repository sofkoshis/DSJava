package mow;

public class Yard {
    public char yard[][];

    public Yard(int numberRows, int numberColumns) {
        // allocate an array big enough to hold the yard and red brick border.
        yard = new char[numberRows + 2][numberColumns + 2];

        // use a nested loop to fill our array (our backyard)
        for (int row = 0; row < yard.length; row++) {
            for (int col = 0; col < yard[0].length; col++) {
                // is it in the top or bottom row?
                if (row == 0 || row == yard.length - 1) {
                    yard[row][col] = 'R';
                } else if (col == 0 || col == yard[0].length - 1) {
                    // it's in the first or last col.
                    yard[row][col] = 'R';

                } else {
                    yard[row][col] = '+';
                }
            }
        }
    }

    public void print() {
        // use a nested loop to fill our array (our backyard)
        for (int row = 0; row < yard.length; row++) {
            for (int col = 0; col < yard[0].length; col++) {
                System.out.print(yard[row][col]);

            }
            System.out.println();

        }
    }

    public void print(Mower mower) {
        // use a nested loop to fill our array (our backyard)
        for (int row = 0; row < yard.length; row++) {
            for (int col = 0; col < yard[0].length; col++) {
                // is the lawmower on this spot?
                if (row == mower.row && col == mower.col) {
                    System.out.print(mower.getArrow());
                } else {
                    System.out.print(yard[row][col]);

                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Yard y = new Yard(4, 6);
        y.print();
    }

    public char getValue(int row, int col) {
        return yard[row][col];
    }

    public void setValue(int row, int col, char val) {
        yard[row][col] = val;
    }
    public int getWidth() {
        return yard[0].length;

    }
    public int getHeight() {
        return yard.length;
    }
}