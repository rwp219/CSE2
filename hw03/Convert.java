// Reed Pinterich
// Brian Chen CSE 002
// 11 February 2016
// This program converts a measurement given in meters into inches
// import the scanner class as shown in lecture
import java.util.Scanner;
public class Convert {
    public static void main(String[] args) {
        // create a scanner to store the measurement in meters
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a measurement in meters ");
        double inMeters = input.nextDouble();
        // Convertion from meters to inches
        double inInches = (inMeters * 100)/2.54;
        // Print the results
        System.out.println(inMeters + " meters is equal to " + inInches + " inches.");
    }
}