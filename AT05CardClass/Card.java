/*Sofia Koshy
 * AT CompSci with Mr. Eng
 */
import java.util.Random;

public class Card {
    //Enumerated for rank and suit
    enum Suit { SPADE, HEART, CLUB, DIAMOND }

     enum Rank { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING }

     //create private member variables to represent state of the card.
     Suit suit;
     Rank rank;

     //construction.
     public Card(Suit tgSuit, Rank tgRank) {
        suit = tgSuit;
        rank = tgRank;
     }

     public Card() {
        //randomly assign suit and rank.
        int r = (int)(Math.random() * 4);
        //if 0, spade, if 1 heart, etc.
        if (r==0) {
            suit = Suit.SPADE;
        } else if (r==1) {
            suit = Suit.HEART;
        } else if (r==2) {
            suit = Suit.CLUB;
            
        } else if (r==3) {
            suit = Suit.DIAMOND;
        }
        

        r = (int) (Math.random()*13);
        if (r==0) {
            rank = Rank.ACE;
        } else if (r == 1) {
            rank = Rank.TWO;
             } else if (r == 2) {
            rank = Rank.THREE;
             } else if (r == 3) {
            rank = Rank.FOUR;
             } else if (r == 4) {
            rank = Rank.FIVE;
             } else if (r == 5) {
            rank = Rank.SIX;
             } else if (r == 6) {
            rank = Rank.SEVEN;
             } else if (r == 7) {
            rank = Rank.EIGHT;
             } else if (r == 8) {
            rank = Rank.NINE;
             } else if (r == 9) {
            rank = Rank.TEN;
             } else if (r == 10) {
            rank = Rank.JACK;
             } else if (r == 11) {
            rank = Rank.QUEEN;
             } else if (r == 12) {
            rank = Rank.KING;
        }        
     }
     public Rank getRank() {
        return rank;
     }
     public Suit getSuit() {
        return suit;
     }

     public String getFace() {
        String face = "";
        if(rank == Rank.ACE) {
            face = "A";
        } else if (rank== Rank.TWO) {
            face = "2";
             } else if (rank== Rank.THREE) {
            face = "3";
             } else if (rank== Rank.FOUR) {
            face = "4";
             } else if (rank== Rank.FIVE) {
            face = "5";
             } else if (rank== Rank.SIX) {
            face = "6";
             } else if (rank== Rank.SEVEN) {
            face = "7";
             } else if (rank== Rank.EIGHT) {
            face = "8";
             } else if (rank== Rank.NINE) {
            face = "9";
             } else if (rank== Rank.TEN) {
            face = "T";
             } else if (rank== Rank.JACK) {
            face = "J";
            } else if (rank== Rank.QUEEN) {
            face = "Q";
            } else if (rank== Rank.KING) {
            face = "K";
        }
        if (suit == Suit.SPADE) {
            face = face + "S";
        } else if (suit == Suit.HEART) {
            face = face + "H";
             } else if (suit == Suit.DIAMOND) {
            face = face + "D";
             } else if (suit == Suit.CLUB) {
            face = face + "C";
    
        }
        return face;
        }
        
     

     public static void main(String[] args) {
        Card c = new Card(Suit.HEART, Rank.QUEEN);
       // c = new Card (Suit.SPADE, Rank.KING);
        System.out.println(c.getFace());

        Card d = new Card(Suit.SPADE, Rank.ACE);
        System.out.println(d.getFace());

        //use loop to create 10 random cards.
        System.out.println("Ten random cards...");
        for (int i = 0; i < 10; i++) {
            c = new Card();
            System.out.println(c.getFace());

        }
     }


     }

