import java.util.Scanner;

public class PalindromeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        isPalindrome(n);
    }

    private static void isPalindrome(int n) {
        int num = n;
        int rev= 0;
        int temp;

        while(num > 0){
            temp = num % 10;
            rev = rev*10 + temp;
            num = num / 10;
        }
        if(rev == n)
            System.out.print("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
    }
}
