public class Bowtie {
    public static void main(String[] args) {
        int nStars = 9;
        for (int i = 0; i < 9; i++) {
            switch(i) {
                case(0):
                    System.out.print("");
                    break;
                case(1):
                    System.out.print("   ");
                    break;
                case(2):
                    System.out.print("      ");
                    break;
                case(3):
                    System.out.print("         ");
                    break;
                case(4): 
                    System.out.print("            ");
                    break;
                case(5):
                    System.out.print("         ");
                    break;
                case(6):
                    System.out.print("      ");
                    break;
                case(7):
                    System.out.print("   ");
                    break;
                case(8):
                    System.out.print("");
            }
            for (int j = nStars; j > 0; j--) {
                System.out.print(" * ");
            }
            switch(i) {
                case(0):
                case(1):
                case(2):
                case(3):
                    nStars = nStars - 2;
                    break;
                case(4):
                case(5):
                case(6):
                case(7):
                case(8):
                    nStars = nStars + 2;
                    break;
            }
            System.out.println("");
        }
    }
}