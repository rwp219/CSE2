import java.util.Scanner;
public class Symmetric {
    public static void main(String[] args) {
        System.out.println("Enter a 5 digit integer");
        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();
        if (number < 10000 || number > 99999){
            System.out.println("Thats a bad number, try again");
        }
        else {
            if (((number / 10000)) == (number % 10) && (((number % 10000)/1000)) == ((number % 100) / 10)){
                System.out.println(number + " is a symmetric number");
            }
            else {
                System.out.println(number + " is not a symmetric number");
            }
        }
    }
}