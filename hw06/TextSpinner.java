//Reed Pinterich
//Brian Chen CSE 002
//March 6 2016
//This program prints an infinite loop of characters that create the illusion of a spinner
public class TextSpinner {
    public static void main(String[] args) {
        int x = 0;
        while(x == 0) {
            System.out.print("/");
            System.out.print("\b");
            System.out.print("-");
            System.out.print("\b");
            System.out.print("\\");
            System.out.print("\b");
            System.out.print("|");
            System.out.print("\b");
        }
    }
}