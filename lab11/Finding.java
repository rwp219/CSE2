import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class Finding {
        public static void Extremes(int[] array) {
            int max = array[0];
            int min = array[0];
            for (int j = 0; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                }
                if (array[j] < min) {
                    min = array[j];
                }
            }
            System.out.println("The max is " + max + " The min is " + min);
        }
        public static int Prompt() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter an integer greater than or equal to zero");

            if(scan.hasNextInt() == true) {
                int input = scan.nextInt();
                if (input >= 0)  {
                    return input;
                }
                else {
                    System.out.println("Thats not greater than or equal to zero");
                    return -1;
                }
            }
            else {
               return -1;
        //scan.next();
           }
        }
        public static int Binary(int[] array) {
            int user = Prompt();
            while(user<0)
            {
                user = Prompt();
            }
            int first = 0;
            int last = array.length-1;
            int location = 0;
            while(first < last) {
                int middle = (first + last) / 2;
                if (user > array[middle]) {
                    first = middle + 1;
                }
                else {
                    last = middle;
                }
                if (user == array[middle]) {
                    location = first;
                    System.out.print("The number was found at location " + location);
                }
                else {
                    first = last;
                    System.out.println("Number not found");
                    int close = array[0];
                    int far = array[0];
                    int subtract;
                    for (int h = 0; h < array.length; h++) {
                        if (array[h] < user) {
                            subtract = Math.abs(user - close);
                            if (subtract > Math.abs(user - array[h])) {
                                close = array[h];
                                far = array[h+1];
                                    if (close < user && far > user) {
                                        System.out.println("The value before is " + close + " The value after is " + far);
                                        break;
                                    }
                            }
                        }
                    }
                }
            }
            return location;
        }
    public static void main(String[] args) {
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        Random rand = new Random();
        int start = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = rand.nextInt(101);
        }
        for (int l = 0; l < array2.length; l++) {
            start = start + rand.nextInt(101);
            array2[l] = start;
        }
        Binary(array2);
    }
}