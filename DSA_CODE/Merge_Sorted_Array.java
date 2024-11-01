import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sorted_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Input size of nums1 and m (actual elements count)
        System.out.print("Enter the size of nums1: ");
        int size1 = sc.nextInt();
        System.out.print("Enter the number of actual elements in nums1: ");
        int m = sc.nextInt();
   
        // Initialize nums1 with the given size
        int[] nums1 = new int[size1];
        System.out.println("Enter the elements of nums1:");
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Input size of nums2 and n (actual elements count)
        System.out.print("Enter the size of nums2: ");
        int size2 = sc.nextInt();
        System.out.print("Enter the number of actual elements in nums2: ");
        int n = sc.nextInt();

        // Initialize nums2
        int[] nums2 = new int[size2];
        System.out.println("Enter the elements of nums2:");
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        // Merge nums2 into nums1
        for (int j = 0, i = m; j < n; j++, i++) {
            nums1[i] = nums2[j];
        }

        // Sort nums1 after merging
        Arrays.sort(nums1);

        // Output the merged and sorted array
        System.out.println("Merged and sorted array: " + Arrays.toString(nums1));
    }
}

