import java.util.Scanner;

public class OddEvenWithoutModuloIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

//        String ans = new String[]{"Even","Odd"}[(n&1)];
        String ans = ((n&1)==1) ? "Odd":"Even";
        System.out.println("Number is "+ans);
    }
}
