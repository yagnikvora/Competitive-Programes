import java.util.Scanner;

public class DecimalToBCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number : ");
        int n = sc.nextInt();
        System.out.println("BCD : "+convertToBCD(n));
        sc.close();
    }
    public static String convertToBCD(int decimal) {
        String bcd = "";
        while (decimal > 0) {
            int digit = decimal % 10;
            bcd += String.format("%4s", Integer.toBinaryString(digit)).replace(' ', '0');
            decimal /= 10;
        }
        return bcd;
    }
}
