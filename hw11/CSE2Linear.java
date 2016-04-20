//Reed Pinterich
//April 16 2016
//Brian Chen
//This program takes an array grades that is ordered and allows the user to search for an element..
import java.util.Scanner;
import java.util.Random;
public class CSE2Linear {
    public static void main(String[] args) {
        System.out.println("Enter 15 integers for an array between 0 and 100 and in increasing order");
        int [] user = Prompt();
        while(user[0] < 0) {
            user = Prompt();
        }
        for (int z = 0; z < user.length; z++)
        {
            System.out.print(user[z] + " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Enter a grade to be searched for");
        int search = scanner.nextInt();
        for (int m = 0; m < user.length; m++) 
        {
            if (user[m] == search) 
            {
                System.out.println("Found it after " + m + " iterations.");
                break;
            }
            else {
                if (m != user.length - 1) {
                    System.out.println("Still looking...");
                }
                else {
                    System.out.println("Search not found.");
                }
            }
        }
        int[] scramble = Scramble(user);
        System.out.println("The scrambled array is ");
        for (int s = 0; s < scramble.length; s++)
        {
            System.out.print(scramble[s] + " ");
        }
    }
    public static int[] Prompt() {
            int [] neg = {-1};
            int [] grades = new int[15];
            for (int i = 0; i < grades.length; i++) 
            {
                Scanner scan = new Scanner(System.in);
                if (scan.hasNextInt()) 
                {   
                    grades[i] = scan.nextInt();
                    if (grades[i] >= 0 && grades[i] <= 100) 
                    {
                        if (i==grades.length -1) 
                        {
                            OrderCheck(grades);
                        }
                    }
                    else 
                    {
                        System.out.println("Thats not between 0 and 100");
                        return neg;
                    }
                }
                else 
                {
                    System.out.println("Thats not an integer.");
                    return neg;
                }
            }
        return grades;
    }
    public static int[] OrderCheck(int[] array) {
        int count = 0;
        int [] neg = {-1};
        for (int k = 0; k < array.length - 1; k++)
        {
                if (array[k] <= array[k+1]) 
                {
                    if (k == array.length - 1) {
                        return array;
                    }
                }
                else {
                    System.out.println("They are not in increasing order, please enter the elements again.");
                    return neg;
                }
        }
        return null;
    }
    public static int[] Scramble(int[] array) {
        Random rand = new Random();
        for (int b = array.length - 1; b > 0; b--) {
            int start = rand.nextInt(b+1);
            int temp = array[start];
            array[start] = array[b];
            array[b] = temp;
        }
        return array;
    }
}