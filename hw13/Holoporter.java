import java.util.Scanner;
import java.util.Random;
public class Holoporter {
    public static void main(String[] args) {
        String[][][] array = Fill(soRandom());
        String[][][] holder = soRandom();
        Print(array);
        System.out.println("");
        String [][][] holo = holoport(array,holder);
        Print(holo);
        String code = getCode();
        search(holo,code);
        percentage(array,holo);
        
    }
    public static String[][][] soRandom() {
        Random rand = new Random();
        int L1 = rand.nextInt(10);
        int L2 = rand.nextInt(10);
        int L3 = rand.nextInt(10);
        String [][][] threeD = new String[L1][][];
        for (int i = 0; i < threeD.length; i++) {
            threeD[i] = new String[L2][];
            for (int j = 0; j < threeD[i].length; j++) {
                threeD[i][j] = new String[L3];
                for (int k = 0; k < threeD[i][j].length; k++) {
                    
                }
            }
        }
        System.out.println("");
        return threeD;
    }
    public static String[][][] Fill(String[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = coder();
                }
            }
        }
        return array;
    }
    public static String[][][] makeMoney(String[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = "$$$$$$";
                }
            }
        }
        return array;
    }
    public static String coder() {
        String code = "";
        Random rand = new Random();
        String a = charGen();
        String b = charGen();
        String one = numGen();
        String two = numGen();
        String three = numGen();
        String four = numGen();
        code = a + b + one + two + three + four;
        return code;
        
    }
    public static String charGen() {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Random rand = new Random();
        int letter = rand.nextInt(26);
        String choice = alphabet[letter];
        return choice;
    }
    public static String numGen() {
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        Random rand = new Random();
        int number = rand.nextInt(10);
        String choice = digits[number];
        return choice;
    }
    public static void Print(String[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("[");
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k]);
                    if (k < array[i][j].length-1) {
                        System.out.print(" , ");
                    }
                }
                System.out.print("]");
                if (j < array[i].length - 1) {
                    System.out.print("|");
                }
            }
            if (i < array.length - 1) {
                System.out.print("---");
            }
        }
    }
    public static String[][][] holoport(String[][][] array, String[][][] holder) {
        String[][][] funny = makeMoney(holder);
        for (int i = 0; i < funny.length; i++) {
            if (i == array.length) {
                break;
            }
            for (int j = 0; j < funny[i].length; j++) {
                if (j == array[i].length) {
                    break;
                }
                for (int k = 0; k < funny[i][j].length; k++) {
                    if (k == array[i][j].length) {
                        break;
                    }
                        funny[i][j][k] = array[i][j][k];
                }
            }
        }
        return funny;
    }
    public static String getCode() {
        System.out.println("Please Enter a code in the form XXYYYY where x is a letter and y is a number");
        boolean check = false;
        String[] nums = {"0","1","2","3","4","5","6","7","8","9"};
        String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String code;
        do {
            Scanner scan = new Scanner(System.in);
            code = scan.next();
            if (code.length() == 6) {
                for (int i = 0; i < 1; i++) {
                    for (int j = 0; j < 25; j++) {
                        if (code.substring(i,i+1).equals(letters[j])) {
                            for (int k = 2; k < 5; k++) {
                                for (int l = 0; l < 9; l++) {
                                    if (code.substring(k,k+1).equals(nums[l])) {
                                        check = true;
                                        return code;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (check == false) {
                System.out.println("Invalid entry please try again.");
            }
        } while(check);
        return code;
    }
    public static void search(String[][][] array, String code) {
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k].equals(code)) {
                        System.out.println("The code was found at {" + i + ", " + j + ", "+ k + "}");
                        check = true;
                    }
                    
                }    
            }
        }
        if (check == false) {
            System.out.println("The code was not found.");
        }
    }
    public static void percentage(String[][][] array, String[][][] holoported) {
        int arrayCount = 0;
        int holoCount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    arrayCount++;
                }
            }
        }
        for (int x = 0; x < holoported.length; x++) {
            for (int y = 0; y < holoported[x].length; y++) {
                for (int z = 0; z < holoported[x][y].length; z++) {
                    holoCount++;
                }
            }
        }
        double percentage;
        if (holoCount > arrayCount) {
            percentage = (holoCount - arrayCount)/arrayCount;
        }
        else {
            percentage = (holoCount - arrayCount)/arrayCount;
        }
        System.out.println("The percentage of the holoported array is : " + percentage);
    }
}