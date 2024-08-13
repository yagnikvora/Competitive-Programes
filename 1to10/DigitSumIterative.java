import java.util.*;
public class DigitSumIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println("Sum of Digits : "+digitSum(n));
        sc.close();
    }

    private static int digitSum(int n) {
        int digit=0,sum=0;
        while (n>0) {
            digit = n%10;
            sum += digit;
            n = n/10;
        }
        return sum;
    }
}
