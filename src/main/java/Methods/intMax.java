package Methods;

public class intMax {
    public static int findMaxNumber(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
    public static void main(String[] args) {
        int max = findMaxNumber(111, 96);
        System.out.println("Maximum number is: " + max);
    }
}
