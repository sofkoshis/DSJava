package mow;

import java.util.Random;

public class Mower {
   public int row, col, dir;

    //constructor.
    public Mower (int row, int col, int dir) {
        this.row = row;
        this.col = col;
        this.dir = dir;
    }
    //public methods.
    public void move() {
        //this method makes the robot move 1 square forward
        if(dir == 0) {
            //pointing up
            //move up one row
            row--;
        } else if (dir == 1) {
            //pointing to the right
            //move to the right one col.
            col++;
        } else if (dir == 3) {
            //pointing down
            //move down one row.
            row++;
        } else {
            col--;
            //assume it is pointing to the left
            //move to the left by one.
        }
    }
    public void right() {
        // increases dir by 1
        dir++;
        if(dir == 4) {
            dir = 0; //wrap back to 0.
        }
    }
        public void left() {
            //decrease dir by 1.
            dir--;
            if(dir < 0) {
                dir = 3;
            }
        }

        //this method looks one block in front of mower
        //and returns true if there is unmown grass ('+')
        //or false other wise ('R' or ' ')
        public boolean unmownInFront(Yard yard) {
            int nextrow = row;
            int nextcol = col;
            if(dir == 0) {
                nextrow--;
            } else if(dir == 1) {
                nextcol++;
            } else if(dir == 2) {
                nextrow++;

            } else {
                //assume we are pointing to the left.
                nextcol--;
        }
        char val = yard.getValue(nextrow, nextcol);
        if (val == '+') {
            //unmowed grass.
            return true;
        } else {
            return false;
        }
    }
    public char getArrow() {
        if(dir==0) {
            //pointing up.
            return '^';
        } else if (dir == 1) {
            //pointing to the right.
            return '>';

        } else if (dir ==2) {
            //pointing down.
            return 'v';
        } else {
            //assume tp the left.
            return '<';
        }
    }
    public void mow(Yard yard) {
        //this method mows the lawn underneath the mower.
        yard.setValue(row, col, ' ');
    }
    public void randomize(Yard yard) {
        //this method places the mower in one of the 4 corners of the yard
        //it also places it in a random direction
        //generate a random number from 0 - 3
        Random random = new Random();
        int r = random.nextInt(4);
        if(r==0) {
            //upper left hand corner.
            row = 1;
            col = 1;
        } else if  (r == 1) {
            //upper right hand corner.
            row = 1;
            col = yard.getWidth() -2;
        } else if (r==2) {
            //lower right hand corner.
            row = yard.getHeight() - 2;
            col = yard.getWidth() -2;
        } else {
            //lower elft corner
            row = yard.getHeight() - 2;
            col = 1;
        }
        //set direction.
        dir = random.nextInt(4);
        }



    

    
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    public static void delay(long mseconds) {
        try {
            Thread.sleep(mseconds);
        } catch (InterruptedException e) {
            System.err.println("InterruptedException received!");
        }
    } 
    public static void main(String[] args) {
        Yard y = new Yard(6,20);
        Mower m = new Mower(1,1,1);

        while(true) {
            //clear screen
            clearScreen();

            //print
           y.print(m);

            //mow current spot.
            m.mow(y);
            
            //check in front of us unmown grass.
            if(m.unmownInFront(y)) {
                //move forward
                m.move();
                delay(500);
                
            } else {
                //we are done
                break;
            }
        }
    }

    }

