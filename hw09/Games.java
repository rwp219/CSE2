//Reed Pinterich
//CSE 002 
//Brian Chen
//This program functions as an arcade with 3 games
import java.util.Scanner;
import java.util.Random;
public class Games {
    // Guess the box prompts the user for an integer which may contain a prize, 
    // the guess is then checked for the prize and determines win or loss
    public static void guessTheBox() {
        System.out.println("Guess which box the prize is under, enter 1, 2, or 3");
        int x = 0;
        while (x == 0) {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                Random rand = new Random();
                int choice = rand.nextInt(2) + 1;
                int input = scan.nextInt();
                if (input > 0 && input < 4) {
                    x = 1;
                    if (choice == input) {
                        System.out.println("Thats correct you win.");
                        break;
                    }
                    else {
                        System.out.println("Sorry it was under box " + choice);
                        break;
                    }
                }
                else {
                    System.out.println("Thats an invalid entry try again.");
                    x = 1;
                }
            }
            else {
                System.out.println("Thats invalid input try again");
                x = 1;
            }
            x = 0;
        }
    }
    // Spin the wheel asks for a guess of red or black and 1-5 then checks the 
    // guess to see if it is right
    public static void spinTheWheel() {
        System.out.println("Enter a color r or b for red or black");
        int x = 0;
        while(x == 0) {
            Scanner scan = new Scanner(System.in);
            if(scan.hasNext()) {
                int y = 0;
                int temp;
                String color = scan.next();
                if (color.equals("b") || color.equals("r") || color.equals("R") || color.equals("B")) {
                    x = 1;
                    System.out.println("Enter a number between 1 and 5 inclusive");
                    while (y == 0) {
                        Scanner scanOne = new Scanner(System.in);
                        if (scanOne.hasNextInt()) {
                            Random rand = new Random();
                            int colorRand = rand.nextInt(1);
                            int numRand = rand.nextInt(4) + 1;
                            int numChoice = scanOne.nextInt();
                            if (numChoice > 0 && numChoice < 6) {
                                y = 1;
                                if (color.equals("r") || color.equals("R")) {
                                    temp = 0;
                                    if (numChoice == numRand && temp == colorRand) {
                                        System.out.println("You win");
                                    }
                                    else {
                                        System.out.println("You lose");
                                    }
                                }
                                else {
                                    temp = 1;
                                    if (numChoice == numRand && temp == colorRand) {
                                        System.out.println("You win");
                                    }
                                    else {
                                        System.out.println("You lose");
                                    }
                                }
                            }
                            else {
                                System.out.println("That is an invalid entry try again.");
                                y = 0;
                            }
                        }
                        else {
                            System.out.println("Thats invalid input try again. ");
                            y = 0;
                        }
                    }
                }
                else {
                    System.out.println("thats invalid input try again");
                    x = 0;
                }
            }
            else {
                System.out.println("Thats invalid input try again.");
                x = 0;
            }
        }
    }
    // Scrambler prompts the user for a string to be scrambled and then returned to the user.
    public static void scrambler() {
        System.out.println("Enter a word.");
        int x = 0;
        while(x == 0) {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNext()) {
                String input = scan.next();
                Random rand = new Random();
                int length;
                int choice;
                for (int i = 0; i < 5; i++) {
                    length = input.length();
                    choice = rand.nextInt(length);
                    String take = input.substring(choice);
                    String over = input.replace(take, "") + input.replace(input.substring(0), take); 
                    if (i == 4) {
                        System.out.println(over);
                        x = 1;
                    }
                }
            }
            else {
                System.out.println("Thats invalid input try again.");
                x = 0;
            }
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Ocean Game Center");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter g for guess the box, or enter w for spin the wheel or enter s for scrambler");
        if (scan.hasNext()) {
            String input = scan.next();
            switch(input) {
                case("g"):
                    guessTheBox();
                    break;
                case("w"):
                    spinTheWheel();
                    break;
                case("s"):
                    scrambler();
                    break;
                default:
                    System.out.println("The arcade does not have that game.");
                    break;
            }
        }
        else {
            System.out.println("Incorrect input try again.");
        }
    }
}