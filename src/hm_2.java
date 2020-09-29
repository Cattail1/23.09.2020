;

public class hm_2 {
    public static void main(String[] args) {

      int sumNegativeNum = 0;
      int sumPositiveNum = 0;

      int[] vector = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

            for (int index=0; index < vector.length; index++){ // i - это индекс

                if (vector[index] > 0){
                    sumPositiveNum += vector[index];  // 0

                }
                else if (vector[index] < 0){
                    sumNegativeNum += vector[index]; // -5 +(-4) = -9 +(-3) = .....
                }
            }
        System.out.println("Сумма отрицательных чисел равна: " + sumNegativeNum );

        System.out.println("Сумма положительных чисел равна: " + sumPositiveNum );

    }
}
