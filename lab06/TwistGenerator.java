import java.util.Scanner;
//Reed Pinterich
//Lab 06
//Brian Chen
//March 4 2016
// This program prints a simple twist
public class TwistGenerator {
    public static void main(String[] args) {
        int x = 0;
        while(x == 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the desired twist length");
            if (scan.hasNextInt()){
            int length = scan.nextInt();
            if (length > 0) {
                x = 1;
                int crosses = (length - 1)/3;
                int slashes = (2 * crosses + 1)/2;
                int countOne = 0;
                int countTwo = 0;
                int countThree = 0;
                while(countOne < slashes) {
                    System.out.print("\\ /");
                    countOne++;
                }
                System.out.println("");
                while(countTwo < crosses) {
                    System.out.print(" X ");
                    countTwo++;
                }
                System.out.println("");
                while(countThree < slashes) {
                    System.out.print("/ \\");
                    countThree++;
                }
                System.out.println("");
            }
            else {
                System.out.println("Sorry try again");
            }
            }
            else {
                System.out.println("Sorry try again");
            }
        }
    }
}