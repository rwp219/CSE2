import java.util.Scanner;
import java.util.Random;
public class Array {
    public static void main(String[] args) {
        Random rand = new Random();
        int numStudents = rand.nextInt(6);
        numStudents = numStudents + 5;
        System.out.println("Enter " + numStudents + " student names.");
        Scanner scan = new Scanner(System.in);
        String[] students = new String[numStudents];
        int[] midterm = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            students[i] = scan.nextLine();
        }
        for (int j = 0; j < numStudents; j++) {
            midterm[j] = rand.nextInt(100) + 1;
        }
        System.out.println("Here are the grades of the students above.");
        for (int k = 0; k < numStudents; k++) {
            System.out.println(students[k] + " : " + midterm[k]);
        }
    }
}