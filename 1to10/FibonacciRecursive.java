import java.util.*;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n steps : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i)+",");
        }
        sc.close();
    }
    
    private static int fibonacci(int n) {
        if(n<= 1)
            return n;
        
        return (fibonacci(n-1)+fibonacci(n-2));
    }
}
