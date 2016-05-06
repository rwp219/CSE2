import java.util.Scanner;
import java.util.Random;
public class TwoDarray {
    public static void main(String[] args) {
        int [][] user = Create();
        Print(user);
        Selection(user);
        Print(Selection(user));
        Print(SortByLength(user));
        Search(user);
    }
    public static int Prompt() {
        System.out.println("Enter an integer");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        return input;
    }
    public static void Print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }
    }
    public static int[][] Create() {
        Random rand = new Random();
        int user = Prompt();
        int [][] array = new int [user][];
        for (int i = 0; i < user; i++) {
            int col = rand.nextInt(user+1);
            array[i] = new int[col];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(21);
            }
        }
        return array;
    }
    public static int[][] Selection(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i].length; k++) {
                    if (array[i][k] > array[i][j]) {
                        int temp = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = temp;
                    }
                }
            }
        }
        return array;
    }
    public static int[][] SortByLength(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].length < array[j].length) {
                    int[] temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static void Search(int[][] array) {
        int check = Prompt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (check == array[i][j]) {
                    System.out.println("Found it at Row = " + i + " Column = " + j);
                    break;
                }
                else {
                    if (i == array.length && j == array[array.length].length) {
                        System.out.println("Number not found");
                        break;
                    }
                }
            }
        }
    }
}