package Loops;

public class SortArray {
    public static void main (String [] args) {
        int [] arr = {2, 2, 5, 5, 5, 2, 2, 5, 2, 5, 2, 2};
        for (int i=0; i < arr.length; i++) {
            if (arr[i]==2)
                System.out.print(arr[i] + "  ");

        }
        for (int j=0; j< arr.length; j++)  {
            if (arr[j]==5)
                System.out.print(arr[j]+ "  ");
        }
    }

}
