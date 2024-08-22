import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        isPrime(n);
    }

    private static void isPrime(int n) {
        for(int i = 2;i<Math.sqrt(n)+1;i++){
            if(n%i == 0){
                System.out.println("Number is not prime");
                return;
            }
        }
        System.out.println("Number is prime");
    }
}
