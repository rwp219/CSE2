import java.util.Scanner;
import java.util.Random;
public class Practice {
    public static void main(String[] args) {
        Print(makeArray());
    }
    public static int getDigit() {
        Random rand = new Random();
        int digit = rand.nextInt(10);
        return digit;
    }
    public static int[][] makeArray() {
        Random rand = new Random();
        int size1 = rand.nextInt(5) + 3;
        int [][] array = new int [size1][];
        for (int i = 0; i < size1; i++) {
            int size2 = rand.nextInt(5) + 3;
            array[i] = new int[size2];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getDigit();
            }
        }
        return array;
    }
    public static void Print(int[][] array) {
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                System.out.print(array[x][y] + " ");
            }
            System.out.println("");
        }
    }
    public static int[] printSums(int[][] array, int maxlength) {
        maxlength = getLength(array);
        int[] sums = new int[maxlength];
    }
    public static int getLength(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[0].length;
            if (array[i].length > max) {
                max = array[i].length;
            }
            return max;
        }
        return null;
    }
}