// Reed Pinterich
// Brian Chen CSE 002
// 11 February 2016
// This program divides a check given the total, the tip percentage, and the number of people
import java.util.Scanner;
public class Check {
    public static void main(String[] args) {
        // scanner created to store the subtotal
        Scanner inputOne = new Scanner(System.in);
        System.out.print("Enter the total bill ");
        double subtotal = inputOne.nextDouble();
        // another scanner to store the tip
        Scanner inputTwo = new Scanner(System.in);
        System.out.print("Enter the tip percentage ");
        double tip = inputTwo.nextDouble();
        // intermediate calculation for the total
        double total = (subtotal * (tip/100)) + subtotal;
        // another scanner to store the number of people
        Scanner inputThree = new Scanner(System.in);
        System.out.print("Enter the number of people splitting the check ");
        double people = inputThree.nextDouble();
        // calculate how much each person should pay
        double split = (total/people);
        // ints created to chop off extra decimals
        int dollars = (int)split;
        int change = (int)((split * 100) % 100.0);
        // print the results
        System.out.println("The amount each person should pay is $" + dollars + '.' + change);
    }
}