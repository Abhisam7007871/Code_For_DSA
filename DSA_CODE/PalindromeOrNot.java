//        Input: N = 12321
//        Output: Yes
//        Explanation: 12321 is a Palindrome number because after reversing its digits, the number becomes 12321 which is same as the original number.
//        Input: N = 1234
//        Output: No
//        Explanation: 1234 is not a Palindrome number because after reversing its digits, the number becomes 4321 which is different from the original number.
//



import java.util.Scanner;

// This code is for check whether the number is Palindrome or Not

public class PalindromeOrNot {
    public static boolean checkPalindrome(int n)
    {
        int reverse = 0;

        int temp = n;

        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == n);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (checkPalindrome(n)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
