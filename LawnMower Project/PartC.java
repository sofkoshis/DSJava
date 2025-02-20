import mow.*;
public class PartC {
    public static void main(String[] args) {
        Yard y = new Yard(6,8);
        Mower m = new Mower(1,1,1);

        //randomize mower.

     
            m.randomize(y);

            while(true) {
                //mow beneath us
                m.mow(y);
                m.clearScreen();
                y.print(m);
                m.delay(500);
                //check up to 4 times if we can mow
                if(m.unmownInFront(y)) {
                    //mow forward.
                    //continue loop
                    m.move();
                    continue;
                } else {
                    //check to your right
                    m.right();
                     //check in front of us.
                    if(m.unmownInFront(y)) {
                        m.move();
                        continue;
                    } else {
                        //turn right again.
                        m.right();

                        //check in front of us.
                        if (m.unmownInFront(y)) {
                            m.move();
                            continue;
                        } else {
                            //turn right again.
                            m.right();
                            if (m.unmownInFront(y)) {
                                m.move();
                                continue;
                            } else {
                                //we're done break from loop.
                                break;
                            }
                        }
                    }
                }
                }
            }

            


        }
        
    

