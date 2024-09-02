import java.util.Scanner;

public class DecimalToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to convert into Roman : ");
        int n = sc.nextInt();
        System.out.println("Input: " + n + "\nOutput: " + intToRoman(n));
    }

    public static String intToRoman(int num) {
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(romanSymbols[i]);
            }
        }
        return roman.toString();
    }
}
