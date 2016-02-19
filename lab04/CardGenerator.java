/*Reed Pinterich
Brian Chen CSE 002
February 19th 2016
This is a program designed to select a card at random from a deck.
*/
// import the math class
import java.lang.Math;
public class CardGenerator {
    public static void main(String[] args) {
        // get a random number between 0 and 52
        int card = (int) (Math.random()*52) + 1;
        String value;
        String suit;
        // if statements to determine the suit
        if (card < 14){
            suit = "Diamonds";
        }
        else if (card > 13 && card < 27) {
            suit = "Clubs";
        }
        else if (card > 26 && card < 40) {
            suit = "Hearts";
        }
        else {
            suit = "Spades";
        }
        // small intermediate calculation
        int mod13 = card % 13;
        // switch statement to determine the value of the card and print it out.
        switch (mod13) {
            case(1):
            value = "Ace of ";
            System.out.println("You picked the " + value + suit);
            break;
            case(11):
            value = "Jack of ";
            System.out.println("You picked the " + value + suit);
            break;
            case(12):
            value = "Queen of ";
            System.out.println("You picked the " + value + suit);
            break;
            case(0):
            value = "King of ";
            System.out.println("You picked the " + value + suit);
            break;
            default:
            System.out.println("You picked the " + card % 13 + " of " + suit);
            break;
        }
    }
}