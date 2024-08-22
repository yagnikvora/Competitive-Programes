import java.util.Scanner;

public class OddEvenUsingBitwiseOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        isOddEven(n);
    }

    private static void isOddEven(int n) {
        if((n&1) == 1)
            System.out.println("Number is Odd");
        else
            System.out.println("Number is Even");
    }
}
