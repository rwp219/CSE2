import java.util.Scanner;
import java.lang.Math;
public class RandomGames{
    public static void main(String[] args) {
        System.out.println("Enter R or r for Roulette, C or c for Craps, or P or p for pick a card.");
        Scanner pickGame = new Scanner(System.in);
        String game = pickGame.next();
        switch(game) {
            case("R"):
                Roulette();
                break;
            case("r"):
                Roulette();
                break;
            case("C"):
                Craps();
                break;
            case("c"):
                Craps();
                break;
            case("P"):
                Pick();
                break;
            case("p"):
                Pick();
                break;
            default:
                System.out.println("Sorry that's not one of the choices, try again.");
                break;
        }
    }
    public static void Roulette() {
        int run =  (int) (Math.random()*38) + 1;
        switch(run) {
            case(37): 
                System.out.println("You rolled 0");
                break;
            case(38):
                System.out.println("You rolled 00");
                break;
        }
        if (run < 37 && run % 2 == 0) {
            System.out.println("You rolled " + run + " red");
        }
        else if (run < 37 && run % 2 == 1) {
            System.out.println("You rolled " + run + " black");
        }
        else {
            
        }
    }
    public static void Craps() {
        int dieOne = (int) (Math.random() * 6) + 1;
        int dieTwo = (int) (Math.random() * 6) + 1;
        int sum = dieOne + dieTwo;
        System.out.println ("You rolled " + dieOne + " + " + dieTwo + " = " + sum);
    }
    public static void Pick() {
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