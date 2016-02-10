// Import the Scanner Class as shown in lecture
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        // Two scanners to store the base and height
        Scanner inputOne = new Scanner(System.in);
        Scanner inputTwo = new Scanner(System.in);
        System.out.print("Enter the value of the base length ");
        double baseLength = inputOne.nextDouble();
        // Intermediate Calculation to insure baseLength isn't lost when the second scanner is created
        double baseSquared = baseLength * baseLength;
        System.out.print("Enter the value of the height ");
        double height = inputTwo.nextDouble();
        // Another Intermediate Calculation
        double heightOverThree = height/3;
        // Calculate the volume
        double volume = baseSquared * heightOverThree;
        // Print the results
        System.out.println("The volume of the Pyramid you described is " + volume);
    }
}