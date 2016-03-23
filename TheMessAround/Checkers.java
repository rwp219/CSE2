import java.util.*;
//Reed Pinterich
//TheMessAround
//March 7 2016
//This Program determines a number between 1 and 1000 that the user is thinking of.
public class Checkers {
    public static void main(String[] args) {
        System.out.println("This game is called lower or higher, start by picking a number between 1 and 1000 inclusive");
        Scanner scan = new Scanner(System.in);
        System.out.println("Is it lower or higher than 500?");
        int l = 1;
        int m = 1001;
        int x = 0;
        while (x==0) {
            if(scan.hasNext()) {
                String num = scan.next();
                switch(num) {
                    case("l"):
                        m = (m+l)/2;
                        System.out.println("Now tell me if it is lower or higher than " + (m+l)/2 + " or if I have it");
                        if(l==m) {
                            System.out.println("This is your number " + l);
                            break;
                        }
                        break;
                    case("h"):
                        l = (m+l)/2;
                        System.out.println("Now tell me if it is lower or higher than " + (m+l)/2 + " or if I have it");
                        if (l==m) {
                            System.out.println("This is your number " + l);
                            break;
                        }
                        break;
                    case("n"):
                        x = 1;
                        System.out.println("Your number is " + (m+l)/2);
                        break;
                    default:
                        System.out.println("invalid input try again");
                        break;
                }
            } 
        }
    }
}