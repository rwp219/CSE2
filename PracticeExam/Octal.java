import java.util.Scanner;
public class Octal {
    public static void main(String[] args) {
        System.out.println("Enter an octal integer less than 1000");
        Scanner scan = new Scanner(System.in);
        int octal = scan.nextInt();
        int divHun = octal / 100;
        int divTen = octal % 100 / 10;
        int divOne = (octal % 100) % 10;
        int inBaseTen = divHun*64 + divTen*8 + divOne;
        if (octal > 1000 || octal < 0) {
            System.out.println("That's an invalid input, try again.");
        }
        else if (octal == 1000) {
            System.out.println("The number in base 10 is 512");
        }
        else {
            System.out.println("The number in base 10 is " + inBaseTen);
        }
    }
}