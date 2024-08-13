import java.util.*;

public class DigitSumRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("Sum of Digits : " + digitSum(n));
        sc.close();
    }

    public static int digitSum(int n) {
        if (n == 0) {
            return 0;
        } else
            return ((n % 10) + digitSum(n / 10));
    }
}
