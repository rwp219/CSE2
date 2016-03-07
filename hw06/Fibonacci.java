import java.util.Scanner;
//Reed Pinterich
//Brian Chen CSE 002
//March 6 2016
//This program takes two positive integers, and prints out the number of corresponding fibonacci numbers the user desires
public class Fibonacci {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        while (x == 0 || y == 0 || z == 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the first two fibonacci numbers and then how many you desire.");
            if(scan.hasNextInt()) {
                int a = scan.nextInt();
                if (a > 0) {
                    x = 1;
                    if (scan.hasNextInt()) {
                        int b = scan.nextInt();
                        if (b > 0) {
                            y = 1;
                            if (scan.hasNextInt()) {
                                int c = scan.nextInt();
                                if (c > 0) {
                                    z = 1;
                                    int count = 0;
                                    System.out.print(a + ", " + b + ", ");
                                    int q = 0;
                                    while (count <= (c-3) && q == 0) {
                                        int next = a + b;
                                        System.out.print(next + ", " );
                                        if (count == (c-4)) {
                                            q = 1;
                                            System.out.print(next + b + ".");
                                            System.out.println("");
                                        }
                                        count++;
                                        a = b;
                                        b = next;
                                    }
                                }
                                else {
                                    System.out.println("Sorry you've enter an invalid input try again.");
                                }
                            }
                        }
                        else {
                            System.out.println("Sorry you've enter an invalid input try again.");
                        }
                    }
                }
                else {
                    System.out.println("Sorry you've enter an invalid input try again.");
                }
            }
        }
    }
}