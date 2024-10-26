import java.util.Scanner;

public class Reverse_Array {

//    Input : 1, 2, 3, 4, 5
//    Output :5, 4, 3, 2, 1
//
//    Input :  10, 20, 30, 40
//    Output : 40, 30, 20, 10


    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }

    public static void main(String[] args)
    {
        int [] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);
    }
}
