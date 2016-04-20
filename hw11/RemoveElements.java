//Reed Pinterich
//16 April 2016
//Brian Chen CSE2
// This program writes a few methods that pertain to the class RemoveElements.
import java.util.Scanner;
import java.util.Random;
public class RemoveElements {
    public static void main(String[] args) {
        int[] input = randomInput();
        for (int j = 0; j < input.length; j++) 
        {
            System.out.print(input[j] + " ");
        }
        int[] next = delete(input, 3);
        System.out.println("");
        for (int k = 0; k < next.length; k++) 
        {
            System.out.print(next[k] + " ");
        }
        int[] nextNext = remove(input, 4);
        System.out.println("");
        for (int l = 0; l < nextNext.length; l++)
        {
            System.out.print(nextNext[l] + " ");
        }
    }
    public static int[] randomInput() {
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = rand.nextInt(10);
        }
        return array;
    }
    public static int[] delete(int[] list, int pos) {
        int [] fun = new int[list.length-1];
        for (int i = 0; i < fun.length; i++)
        {
            if (i < pos) {
                fun[i] = list[i];
            }
            else {
                fun[i] = list[i+1];
            }
        }
        return fun;
    }
    public static int[] remove(int[] list, int target) {
        int count = 0;
        for (int j = 0; j < list.length; j++)
        {
            if (list[j] == target) {
                count++;
            }
        }
        int [] funny = new int[list.length];
        for (int k = 0; k < list.length; k++) 
        {
            if (list[k] == target) 
            {
               funny = delete(list, k);
            }
        }
        return funny;
    }
}