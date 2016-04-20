// Reed Pinterich
// Brian Chen CSE 002
// 11 February 2016
// This program converts a measurement given in meters into inches
// import the scanner class as shown in lecture
import java.util.Scanner;
import java.lang.Math;
public class Convert {
    public static String convertToDay(int y) {
        String day = "";
        switch(y) {
            case(0):
                break;
            case(1):
                day = "Monday";
                break;
            case(2):
                day = "Tuesday";
                break;
            case(3):
                day = "Wednesday";
                break;
            case(4):
                day = "Thursday";
                break;
            case(5):
                day = "Friday";
                break;
            case(6):
                day = "Saturday";
                break;
            case(7):
                day = "Sunday";
                break;
            default:
                System.out.println("Error not a day");
                break;
        }
        return day;
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(i);
            }
            if (i < 5) {
                System.out.println("");
            }
        }
        for (int k = 3; k >= 0; k--) {
            for (int l = 0; l <= k; l++) {
                System.out.print(k);
            }
            System.out.println("");
        }
    }
}