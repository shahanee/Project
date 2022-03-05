package Loops;

public class Sum {
    public static void main(String[] args) {
        short[] arr = {1, 44, 5, 2, 7, 12, 11};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                sum += arr[i] * 0.01 * arr[i] ;

            }
        }
        System.out.println(sum);
    }
}
