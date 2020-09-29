import java.util.Random;

public class Hw_4 {


    public static void main(String[] args) {
        Random dog = new Random();
        int [][] cat = new int[6][];
        int max = 30;
        int min = -15;

        for (int i = 0;i < cat.length; i++) {
            cat[i] = new int[dog.nextInt(max - min) + min];
            for (int g = 0; g < cat[i].length; g++) {
                cat[i][g] = dog.nextInt(max - min) + min;
                System.out.println(cat[i][g] + " ");
            }
            System.out.println();
        }

    }
}
