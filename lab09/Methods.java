import java.util.Random;
public class Methods {
    public static void Adjective() {
        String result = "";
        Random rand = new Random();
        int num = rand.nextInt(10);
        switch (num) {
            case(0):
                result = "hairy ";
                break;
            case(1):
                result = "scary ";
                break;
            case(2):
                result = "fuzzy ";
                break;
            case(3):
                result = "red ";
                break;
            case(4):
                result = "blue ";
                break;
            case(5):
                result = "silver ";
                break;
            case(6):
                result = "grey ";
                break;
            case(7):
                result = "orange ";
                break;
            case(8):
                result = "black ";
                break;
            case(9):
                result = "purple ";
                break;
        }
        System.out.print(result);
    }
    public static void Subject() {
        String result = "";
        Random rand = new Random();
        int num = rand.nextInt(10);
        switch (num) {
            case(0):
                result = "cat ";
                break;
            case(1):
                result = "dog ";
                break;
            case(2):
                result = "duck ";
                break;
            case(3):
                result = "mouse ";
                break;
            case(4):
                result = "giraffe ";
                break;
            case(5):
                result = "goose ";
                break;
            case(6):
                result = "bull ";
                break;
            case(7):
                result = "knight ";
                break;
            case(8):
                result = "penguin ";
                break;
            case(9):
                result = "parrot ";
                break;
        }
        System.out.print(result);
    }
    public static void Verb() {
        String result = "";
        Random rand = new Random();
        int num = rand.nextInt(10);
        switch (num) {
            case(0):
                result = "ran ";
                break;
            case(1):
                result = "threw ";
                break;
            case(2):
                result = "attacked ";
                break;
            case(3):
                result = "burned ";
                break;
            case(4):
                result = "spit ";
                break;
            case(5):
                result = "flew ";
                break;
            case(6):
                result = "walked ";
                break;
            case(7):
                result = "growled ";
                break;
            case(8):
                result = "climbed ";
                break;
            case(9):
                result = "scratched ";
                break;
        }
        System.out.print(result);
    }
        public static void Predicate() {
        String result = "";
        Random rand = new Random();
        int num = rand.nextInt(10);
        switch (num) {
            case(0):
                result = "the bag. ";
                break;
            case(1):
                result = "the can. ";
                break;
            case(2):
                result = "the umbrella. ";
                break;
            case(3):
                result = "the wall. ";
                break;
            case(4):
                result = "the computer. ";
                break;
            case(5):
                result = "the floor. ";
                break;
            case(6):
                result = "the door. ";
                break;
            case(7):
                result = "the squirrel. ";
                break;
            case(8):
                result = "the house. ";
                break;
            case(9):
                result = "the ball. ";
                break;
        }
        System.out.print(result);
    }
    public static void main(String[] args) {
        System.out.print("The ");
        Adjective();
        Subject();
        Verb();
        Predicate();
        System.out.println("");
    }
}