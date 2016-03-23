import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
       
        int x = 0;
        while (x==0) {
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) {
                x = 1;
                int num = scan.nextInt();
                if (num > 4 && num < 31) {
                    int knot = num;
                    /*for (int i = 1; i <= num; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(i);
                        }
                        System.out.println("");
                    }
                    for (int m = num-1; m > 0; m--) {
                        for (int k = m; k > 0; k--) {
                            System.out.print(m);
                        }
                        System.out.println("");
                    }*/
                    /*int p = 1;
                    int q = 1;
                    int y = num-1;
                    int z = y;
                    while (p <= num) {

                        while (q <= p) {
                            System.out.print(p);
                            q++;
                        }
                        q = 1;
                        System.out.println("");
                        p++;
                    }
                    while (y > 0) {
                        while (z > 0) {
                            System.out.print(y);
                            z--;
                        }
                        z = y - 1;
                        System.out.println("");
                        y--;
                    }*/
                    int g = 1;
                    int h = 1;
                    int r = num - 1;
                    int s = r;
                    do {
                        do {
                            System.out.print(g);
                            h++;
                        } while (h <= g);
                        h = 1;
                        g++;
                        System.out.println("");
                    } while (g <= num);
                    do {
                        do {
                            System.out.print(r);
                            s--;
                        } while (s > 0);
                        s = r - 1;
                        r--;
                        System.out.println("");
                    } while (r > 0);
                }
                else {
                    System.out.println("Sorry try again.");
                }
            }
            else {
                System.out.println("Sorry try again.");
            }
        }
    }
}