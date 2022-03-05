package Methods;

public class calcSum {
    public static void calculateSum(double[] array, int N) {
        double sum = 0;
        if (N <= 0)
            System.out.println("Can`t calculate. Number should be greater than 0");

        else {
            for (int i = 0; i < N; i++) {
                sum += array[i];
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        calculateSum(new double[] {3.36, 6.2, 4.0, 55.61, 75.9},3 );
    }
}
