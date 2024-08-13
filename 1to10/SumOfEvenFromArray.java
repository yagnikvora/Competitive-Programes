import java.util.Scanner;

public class SumOfEvenFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "]:");
            arr[i] = sc.nextInt();
        }
        sumEven(arr);
        sc.close();
    }

    public static void sumEven(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            if (a % 2 == 0)
                sum += a;
        }
        System.out.println("Sum of Even Numbers : " + sum);
    }
}