package Loops;

public class Mirror {
    public static void main (String[] args) {
        int [] array = {55, 6, 985, 1, 5, 23, 8, 96};
        for (int i= 0; i<array.length; i++)
            System.out.print(array[array.length-1-i] + " " );

    }

}
