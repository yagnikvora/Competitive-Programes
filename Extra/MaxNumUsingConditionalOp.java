import java.util.Scanner;

public class MaxNumUsingConditionalOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A:");
        int a = sc.nextInt();
        System.out.print("Enter B:");
        int b = sc.nextInt();
        System.out.print("Enter C:");
        int c = sc.nextInt();

        int max = (a>b && a>c) ? a : (b>c) ? b : c;
        System.out.println("Max is : "+max);
    }
}
