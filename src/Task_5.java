import java.util.Random;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] byn = new int[n][n];
        Random dom = new Random();
        int min = -10;
        int max = 20;

        for (int i = 0; i < byn.length; ++i) {
            for (int L = 0; L < byn[i].length; ++L) {
                byn[i][L] = dom.nextInt(max - min) + min;
                if (byn[i][L] % 2 == 0) {
                    System.out.println("0");
                } else {
                    System.out.println("1");
                }
            }
        }

    }
}
