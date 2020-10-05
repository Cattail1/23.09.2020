import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        if (Math.sqrt((double)(a1 * a1 + b1 * b1)) < (double)(c1 * 2)) {
            System.out.println("OK");
        } else {
            System.out.println("Not OK");
        }

    }
}
