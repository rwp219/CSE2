//Reed Pinterich
//Brian Chen CSE 002
//February 21st 2016
//This program will take RGB values and translate them into hexidecimal
import java.util.Scanner;
public class ToHex {
    public static void main(String[] args) {
        System.out.println("Enter the red green blue value.");
        // Three Scanner objects for red,green, and blue respectively
        Scanner inOne = new Scanner(System.in);
        Scanner inTwo = new Scanner(System.in);
        Scanner inThree = new Scanner(System.in);
        int red = inOne.nextInt();
        int green = inTwo.nextInt();
        int blue = inThree.nextInt();
        // Declare string variables to be defined later to create the hexidecimal number
        String divRed;
        String modRed;
        String divGreen;
        String modGreen;
        String divBlue;
        String modBlue;
        if ((green > 255 || green < 0) || (red > 255 || red < 0) || (blue > 255 || blue < 0)) {
            System.out.println("Sorry thats an invalid input, try again.");
        }
        int partRed = red / 16;
        int breakRed = red % 16;
        int partGreen = green / 16;
        int breakGreen = green % 16;
        int partBlue = blue / 16;
        int breakBlue = blue % 16;
        System.out.print("The RGB value in hexidecimal is ");
        // lots of switch statements to chang numbers above 9 to letters
        switch (partRed) {
            case(10):
            divRed = "A";
            System.out.print(divRed);
            break;
            case(11):
            divRed = "B";
            System.out.print(divRed);
            break;
            case(12):
            divRed = "C";
            System.out.print(divRed);
            break;
            case(13):
            divRed = "D";
            System.out.print(divRed);
            break;
            case(14):
            divRed = "E";
            System.out.print(divRed);
            break;
            case(15):
            divRed = "F";
            System.out.print(divRed);
            break;
            default:
            System.out.print(partRed);
            break;
        }
        switch (breakRed) {
            case(10):
            modRed = "A";
            System.out.print(modRed);
            break;
            case(11):
            modRed = "B";
            System.out.print(modRed);
            break;
            case(12):
            modRed = "C";
            System.out.print(modRed);
            break;
            case(13):
            modRed = "D";
            System.out.print(modRed);
            break;
            case(14):
            modRed = "E";
            System.out.print(modRed);
            break;
            case(15):
            modRed = "F";
            System.out.print(modRed);
            break;
            default:
            System.out.print(breakRed);
            break;
        }
        switch (partGreen) {
            case(10):
            divGreen = "A";
            System.out.print(divGreen);
            break;
            case(11):
            divGreen = "B";
            System.out.print(divGreen);
            break;
            case(12):
            divGreen = "C";
            System.out.print(divGreen);
            break;
            case(13):
            divGreen = "D";
            System.out.print(divGreen);
            break;
            case(14):
            divGreen = "E";
            System.out.print(divGreen);
            break;
            case(15):
            divGreen = "F";
            System.out.print(divGreen);
            break;
            default:
            System.out.print(partGreen);
            break;
        }
        switch (breakGreen) {
            case(10):
            modGreen = "A";
            System.out.print(modGreen);
            break;
            case(11):
            modGreen = "B";
            System.out.print(modGreen);
            break;
            case(12):
            modGreen = "C";
            System.out.print(modGreen);
            break;
            case(13):
            modGreen = "D";
            System.out.print(modGreen);
            break;
            case(14):
            modGreen = "E";
            System.out.print(modGreen);
            break;
            case(15):
            modGreen = "F";
            System.out.print(modGreen);
            break;
            default:
            System.out.print(breakGreen);
            break;
        }
        
        switch (partBlue) {
            case(10):
            divBlue = "A";
            System.out.print(divBlue);
            break;
            case(11):
            divBlue = "B";
            System.out.print(divBlue);
            break;
            case(12):
            divBlue = "C";
            System.out.print(divBlue);
            break;
            case(13):
            divBlue = "D";
            System.out.print(divBlue);
            break;
            case(14):
            divBlue = "E";
            System.out.print(divBlue);
            break;
            case(15):
            divBlue = "F";
            System.out.print(divBlue);
            break;
            default:
            System.out.print(partBlue);
            break;
        }
        switch (breakBlue) {
            case(10):
            modBlue = "A";
            System.out.println(modBlue);
            break;
            case(11):
            modBlue = "B";
            System.out.println(modBlue);
            break;
            case(12):
            modBlue = "C";
            System.out.println(modBlue);
            break;
            case(13):
            modBlue = "D";
            System.out.println(modBlue);
            break;
            case(14):
            modBlue = "E";
            System.out.println(modBlue);
            break;
            case(15):
            modBlue = "F";
            System.out.println(modBlue);
            break;
            default:
            System.out.println(breakBlue);
            break;
        }
    }
}