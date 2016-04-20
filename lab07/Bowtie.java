import java.util.Scanner;
public class Bowtie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int nStars = scan.nextInt();
            if (nStars > 2 && nStars < 34 && nStars%2 == 1) {
                for (int i = 0; i < nStars; i++) {
                    for (int j = 0; j < nStars; j++) {
                        if((i < nStars/2  + 1 && j < nStars/2 && i >= j + 1) || ( j >= nStars/2 && i < nStars/2 + 1 && i >= nStars - j)) {
                            System.out.print(" ");
                        }
                        else if ((i >= nStars/2 + 1 && j < nStars/2 && (nStars - i - 1 ) > j) || (j >= nStars/2 && i >= nStars/2 + 1 && nStars - j + 1 <= nStars - i))  {
                            System.out.print(" ");
                        }
                        else {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                
            }
            else {
                System.out.println("Sorry invalid input.");
            }
        }
        else {
            System.out.println("Sorry invalid input.");
        }
    }
}