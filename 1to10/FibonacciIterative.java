import java.util.*;

public class FibonacciIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n steps : ");
        int n = sc.nextInt();
        fibonacci(n);
        sc.close();
    }

    private static void fibonacci(int n) {
        int a = 0,b = 1,temp;
        System.out.print(a + "," + b);
        for (int i = 1; i <= n - 2; i++) {
            temp = a+b;
            System.out.print(","+temp);
            a = b;
            b = temp;
        }
    }
}
