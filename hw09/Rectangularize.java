// Reed Pinterich
// Brian Chen
// CSE 002 
// 3/28/16
import java.util.Scanner;
public class Rectangularize {
    // Method to print a string its length number of times
    public static void Make(String n) {
                int length = n.length();
                for (int i = 0; i < length; i++) {
                    System.out.println(n);
                }
    }
    // Method to make a rectangle with % symbols given an integer
    public static void Make(int m) {
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print("%");
                    }
                    System.out.println("");
                }
    }
    // main method creates the scanner object and decides if the input is a string or an int
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an input");

        if (scan.hasNextInt()) {
            int m = scan.nextInt();
            Make(m);
        }
        if (scan.hasNext()) {
            String n = scan.next();
            Make(n);
        }
    }
}