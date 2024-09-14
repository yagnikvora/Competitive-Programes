//Enter n : 5
//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15
import java.util.Scanner;

public class PatternThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int currentValue = 1;
        for (int i = 1; i <= n; i++) {
            int value = currentValue;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value += (n - j);
            }
            currentValue++;
            System.out.println();
        }
    }
}
