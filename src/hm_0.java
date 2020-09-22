//Имеется целое число n < 10.
//Вывести какому дню недели оно соответствует,
//если при n = 1 день недели = Понедельник.
public class hm_0 {
    public static void main(String[] args) {
        int n;
        for(n = 0; n < 10; n++) {

            if((n == 0) || (n == 7)){

            switch (n) {
                case 0:
                    System.out.println("Понедельник");
                    break;
                case 1:
                    System.out.println("Вторник");
                    break;
                case 2:
                    System.out.println("Среда");
                    break;
                case 3:
                    System.out.println("Четверг");
                    break;
                case 4:
                    System.out.println("Пятница");
                    break;
                case 5:
                    System.out.println("Суббота");
                    break;
                case 6:
                    System.out.println("Воскресенье");
                    break;
                case 7:
                    System.out.println("Понедельник");
                    break;
                case 8:
                    System.out.println("Вторник");
                    break;
                case 9:
                    System.out.println("Среда");
                    break;
            }
            }
        }
    }
}
