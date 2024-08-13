import java.util.*;
public class FactorstOfNumberIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = sc.nextInt();
        factors(n);
        sc.close();
    }
    public static void factors(int n) {
        System.out.print("Factors : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + ",");
        }
    }
}
