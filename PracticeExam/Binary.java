import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        System.out.println("Enter a 1, 2, or 3 digit binary number");
        Scanner myScanner = new Scanner(System.in);
        int binary = myScanner.nextInt();
        if (binary > 111 || binary / 100 > 1 || binary % 100 / 10 > 1 || binary % 10 > 1) {
            System.out.println("That is not a 3 digit or less binary number, try again.");
        }
        switch(binary) {
            case(0):
            System.out.println(" 0 ");
            break;
            case(1):
            System.out.println(" 1 ");
            break;
            case(10):
            System.out.println(" 2 ");
            break;
            case(11):
            System.out.println(" 3 ");
            break;
            case(100): 
            System.out.println(" 4 ");
            break;
            case(101):
            System.out.println(" 5 ");
            break;
            case(110):
            System.out.println(" 6 ");
            break;
            case(111):
            System.out.println(" 7 ");
            break;
            default: 
            System.out.println("That is not a 3 digit or less binary number, try again.");
        }
    }
}