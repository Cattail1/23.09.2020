public class Hw_7_30_09_20 {
    public static void main(String[] args) {
        double all_km = 10.0;
        double previous_day = 10.0;

        for(int i=0; i<6; i++)
        {
            previous_day += previous_day * 0.1;
            all_km = all_km + previous_day;
        }

       System.out.println(all_km );

    }
}
