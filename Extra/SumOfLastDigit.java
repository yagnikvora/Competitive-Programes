import java.util.Scanner;

public class SumOfLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        int sum = (a%10)+(b%10);
        System.out.println("Sum of "+(a%10)+" and "+(b%10)+" : "+sum);
    }
}
