import java.util.*;

public class PrimeNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start : ");
        int start = sc.nextInt();
        System.out.print("Enter End : ");
        int end = sc.nextInt();
        primeRange(start, end);
        sc.close();
    }

    public static void primeRange(int start, int end) {
        int flag = 1;
        for (int i = start; i <= end; i++) {
            flag = 1;
            for (int j = 2; j <= Math.floor(Math.sqrt(i)); j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.print(i + ",");
        }

    }
}
