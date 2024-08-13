import java.util.*;
public class FactorialRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find factorial : ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("Factorial : "+fact);
        sc.close();
        
    }

    private static int factorial(int n) {
        if(n==1)
            return 1;
        else    
            return (n*factorial(n-1));
    }
}
