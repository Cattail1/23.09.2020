public class hw_3 {
    public static void main(String[] args) {
        int[] big = {5, 8, 3, 10, 18, 32, 51, 45, 4, 20, 95};
        for (int i = 0; i < big.length; i++) {
            big[i] = ((int) (Math.random() * 100));
            System.out.print(big[i] + "  ");

        }
        System.out.print("\n");
        //bubbleSort(big);
        for (int i = 0; i < big.length; i++) {
            System.out.print(big[i] + "  ");
        }

    }


}
