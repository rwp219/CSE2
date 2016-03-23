import java.util.Scanner;
public class Stuff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number in base 10 you'd like converted to any base less than 10");
        if (scan.hasNextInt()) {
            int number = scan.nextInt();
            int base = scan.nextInt();
            String toBinary = "";
            int i = 10;
            while (i > 0) {
            int thing = number%base;
            number = number/base;
            switch (thing) {
                case(0):
                    toBinary = "0" + toBinary;
                    break;
                case(1):
                    toBinary = "1" + toBinary;
                    break;
                case(2):
                    toBinary = "2" + toBinary;
                    break;
                case(3):
                    toBinary = "3" + toBinary;
                    break;
                case(4):
                    toBinary = "4" + toBinary;
                    break;
                case(5):
                    toBinary = "5" + toBinary;
                    break;
                case(6):
                    toBinary = "6" + toBinary;
                    break;
                case(7):
                    toBinary = "7" + toBinary;
                    break;
                case(8):
                    toBinary = "8" + toBinary;
                    break;
                case(9):
                    toBinary = "9" + toBinary;
                    break;
            }
            if (number == 0) {
                i = 0;
            }

            }
            System.out.println(toBinary);
        }
    }
}