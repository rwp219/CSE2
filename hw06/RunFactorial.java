import java.util.Scanner;
//Reed Pinterich
//Brian Chen CSE 002
//March 6 2016
//This program will calulate factorial of numbers between 9 and 16 inclusive
public class RunFactorial {
    public static void main(String[] args) {
        int x = 0;
        while(x == 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a number between 9 and 16 inclusive.");
            if (scan.hasNextInt()) {
                int fact = scan.nextInt();
                if (fact < 17 && fact > 8) {
                    x = 1;
                    int count = fact;
                    int soFar = 1;
                    while(count > 1) {
                        int h = (fact+1) - 1;
                        soFar = h * soFar;
                        if (count == 2) {
                            System.out.println(soFar);
                        }
                        count--;
                        fact--;
                    }

                }
                else {
                    System.out.println("Sorry that is an invalid input try again");                    
                    
                }
            }
        }
    }
}