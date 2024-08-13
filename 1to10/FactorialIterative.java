import java.util.Scanner;

public class FactorialIterative{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Factorial : "+facorial(n));
    }
    private static int facorial(int n) {
        int fact =1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}