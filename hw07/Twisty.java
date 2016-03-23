// Reed Pinterich 
// CSE 002
// Brian Chen
// March 15 2016
// This program out puts a twisty of hash tags and slashes, unfortunately mine only works for 12 and 6, I just couldnt
// figure out theparameters to make it work for any numbers
import java.util.Scanner;
public class Twisty {
    public static void main(String[] args) {
        int g = 0;
        int b = 0;
        while (g == 0 && b == 0) {
            System.out.println("Please enter the length");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                g = 1;
                int length = scan.nextInt();
                System.out.println("Please enter the width");
                Scanner scanOne = new Scanner(System.in);
                if (scanOne.hasNextInt()) {
                    b = 1;
                    int width = scan.nextInt();
                    int conwidth = width;
                    int count = 0;
                    int track = 0;
                    int width2 = width;
                    int width3 = width/2;
                    if (length <= 80 && width < length) {
                    for (int i = 0; i < conwidth; i++) {
                        while (count < length) {
                            // Here I started a system of for loops to generate the output of the program but 
                            // just cannot seem to figure out how to make it work for any numbers
                        for (int j = 0; j < length; j++) {
                            if (count < length) {
                                if (track < (conwidth/2)) {
                                    System.out.print("#");
                                    count++;
                                }
                                else {
                                    System.out.print("/");
                                    count++;
                                }
                            }
                            else {
                                break;
                            }
                        if (count < length) {
                            if (track < conwidth/2) {
                                for (int k = 0; k < width-2; k++) {
                                    System.out.print(" ");
                                    count++;
                                }
                            }
                            else {
                                for (int z = conwidth/2; z < i; z++) {
                                    System.out.print("  ");
                                    count = count + 2;
                                }
                            }
                        }
                        else {
                            break;
                        }
                        if (count < length) {
                            if (track < conwidth/2) {
                                System.out.print("/");
                                count++;
                            }
                            else {
                                System.out.print("#");
                                count++;
                            }
                        }
                        else {
                            break;
                        }
                        if (count < length) {
                            if (track < conwidth/2) {
                                for (int q = 0; q < i; q++) {
                                    System.out.print("  ");
                                    count = count + 2;
                                }
                            }
                            else {
                                for (int h = 0; h < width3; h++) {
                                    System.out.print("  ");
                                    width3 = width3 - 1;
                                    count = count + 2;
                                }
                            }
                        }
                        else {
                            break;
                        }
                        if (count < length) {
                            if (track < conwidth/2) {
                                System.out.print("\\");
                                count++;
                            }
                            else {
                                System.out.print("#");
                                count++;
                            }
                        }
                        else {
                            break;
                        }
                        if (count < length) {
                            if (track < conwidth/2) {
                                for (int m = 0; m < width-2; m++) {
                                    System.out.print(" ");
                                    count++;
                                }
                            }
                            else {
                                for (int y = conwidth/2; y < i; y++) {
                                    System.out.print("  ");
                                    count = count + 2;
                                }
                            }
                        }
                        else {
                            break;
                        }
                        if (count < length) {
                            if (track < conwidth/2) {
                                System.out.print("#");
                                count++;
                            }
                            else {
                                System.out.print("\\");
                                count++;
                                }
                            }
                            else {
                                break;
                            }
                            if (count < length) {
                                for (int q = 0; q < i; q++) {
                                        System.out.print("  ");
                                        count = count + 2;
                                    }
                                }
                                else {
                                    break;
                                }
                            }
                        }
                        System.out.println("");
                        count = 0;
                        track++;
                        width = width - 2;
                                width2 = width2 -2;
                                if (track < conwidth/2) {
                                    for (int c = i + 1; c > 0; c--) {
                                        System.out.print(" ");
                                    }
                                }
                                else {
                                    for (int d = i + 2; d < conwidth ; d++) {
                                        System.out.print(" ");
                                    }
                                }
                            }
                        }
                        else {
                            System.out.println("Sorry that's invalid input try again.");
                        }
                    }
                    else {
                        System.out.println("Sorry that's invalid input try again.");
                    }
            }
        }
    }
}