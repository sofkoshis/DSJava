import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Jack {
    public static void main(String[] args) {
        Jack jackGame = new Jack();
        jackGame.createDeck();
        String[] cards = new String[] {"Ace" , "Two", "Three", "Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        int  money = 100;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Card> deck = createDeck();
        boolean dWin = false, pWin = false;
        int bet = -1; // Initialize bet to an invalid value.
        while (bet <= 0 || bet > money) {
            System.out.print("You have $ " + money);
            System.out.print(" Place your bet (type 0 to quit): ");

            if (in.hasNextInt()) {
                bet = in.nextInt();

                if (bet == 0) {
                    break;
                } else if (bet < 0 || bet > money) {
                    System.out.println("Invalid bet amount. Please enter a bet between 0 and your available money.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                in.next(); // Clear the invalid input.
            }
        }
    Collections.shuffle(deck);
        while (money > 0) {
            System.out.print("You have $ " + money);
            System.out.print(" Place your bet (type 0 to quit): ");
            
            in.nextLine();
            
            if( bet == 0){
                break;
            }
            if (bet>money || bet<0) {
            continue; 
            }// continue: goes back to beginning of while loop (yt video)

            int score = 0;
            int dealerScore = 0;
          
            ArrayList<Card> playerHand = new ArrayList<>();
            ArrayList<Card> dealerHand = new ArrayList<>();
            
            
            playerHand.add(deck.remove(random.nextInt(deck.size())));
            playerHand.add(deck.remove(random.nextInt(deck.size())));
            dealerHand.add(deck.remove(random.nextInt(deck.size())));
            dealerHand.add(deck.remove(random.nextInt(deck.size())));
            System.out.println("Your hand: " + playerHand.toString());
            System.out.println("Dealer's card: " + dealerHand.toString());
            score = calculateScore(playerHand);

            dealerScore = calculateScore(dealerHand);
            while (true) {
                System.out.println("Enter H to hit or S to stand: ");
                String choice = in.nextLine();
                if (choice.equalsIgnoreCase("h")) {
                    int cardIn = random.nextInt(cards.length);
                    System.out.println("You flipped:"+cards[cardIn]);
            
                    System.out.println("You are at" + score);
                    
                      if (score>21) {
                            dWin = true;
                            break;
                        }
                    if (score == 21) {
                        pWin = true;
                        break;
                    }

                } else if (choice.equalsIgnoreCase("s")) {
                    break;
                }
             
                   if (!dWin) {
                while (dealerScore < 17) {
                    Card card = deck.remove(deck.size() - 1);
                    dealerHand.add(card);
                    System.out.println("Dealer drew: " + card.getFace());
                  dealerScore = calculateScore(dealerHand);
                    System.out.println("Dealer's total: " + dealerScore);
                
                    
                        }
                        if (dealerScore==21) {
                            dWin =true;
                            break;

                        }
                        if (dealerScore>score) {
                            dWin = true;
                            break;
                        }
                        

                    }
                    break;

                    }
            

            }
            if(dWin) {
                System.out.println("You lost!");
                money-=bet;
            }
            if (pWin) {
                System.out.print("You win!");
                money+=bet;
            }

        }
    

    private static ArrayList<Card> createDeck() {
        ArrayList<Card> deck = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
        return deck;
    }

    private static int calculateScore(ArrayList<Card> hand) {
        int score = 0;
        int aceCount = 0;

        for (Card card : hand) {
            score += card.getValue();
            if (card.getRank() == Card.Rank.ACE) {
                aceCount++;
            }
        }

        while (score > 21 && aceCount > 0) {
            score -= 10; 
            aceCount--;
        }

        return score;
    }
    
    public static class Card {
        // Enumerated for rank and suit
        enum Suit {
            SPADE, HEART, CLUB, DIAMOND
        }

        enum Rank {
            ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
        }

        // create private member variables to represent state of the card.
        Suit suit;
        Rank rank;

        // construction.
        public Card(Suit tgSuit, Rank tgRank) {
            suit = tgSuit;
            rank = tgRank;
        }

        public Card() {
            // randomly assign suit and rank.
            int r = (int) (Math.random() * 4);
            // if 0, spade, if 1 heart, etc.
            if (r == 0) {
                suit = Suit.SPADE;
            } else if (r == 1) {
                suit = Suit.HEART;
            } else if (r == 2) {
                suit = Suit.CLUB;

            } else if (r == 3) {
                suit = Suit.DIAMOND;
            }

            r = (int) (Math.random() * 13);
            if (r == 0) {
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
            } else if (r == 10) {
                rank = Rank.QUEEN;
            } else if (r == 10) {
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
        public int getValue() {
                switch (rank) {
            case ACE: return 11; 
            case TWO: return 2;
            case THREE: return 3;
            case FOUR: return 4;
            case FIVE: return 5;
            case SIX: return 6;
            case SEVEN: return 7;
            case EIGHT: return 8;
            case NINE: return 9;
            case TEN: return 10;
            case JACK: return 10;
            case QUEEN: return 10;
            case KING: return 10;
            default: return 0;
    }
}
    }
}

