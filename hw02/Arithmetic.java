//Reed Pinterich
//6 February 2016
//Brian Chen CSE2 HW 02
// This program is designed to calculate the total cost of several items, in addition to their sales tax
public class Arithmetic {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print(i);
            }
            if (i< 5) {
            System.out.println("");
            }
        }
        int count = 0;
        for (int k = 5; k < 9; k++) {
            for (int l = k; l > 0 ; l = k - count) {
                System.out.print(k);
            }
            count = count + 2;
            System.out.println("");
        }
    }
}