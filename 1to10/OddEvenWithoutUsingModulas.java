import java.util.*;

public class OddEvenWithoutUsingModulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        checkOddEven(n);
        sc.close();
    }

//     public static void checkOddEven(int n) {
//         int temp = n / 2;
//         if (temp * 2 == n)
//             System.out.print("Number is Even");
//         else
//             System.out.println("Number is Odd");
//     }

    public static void checkOddEven(int n) {
        if ((n & 1) == 0)
            System.out.print("Number is Even");
        else
            System.out.println("Number is Odd");
    }
}
