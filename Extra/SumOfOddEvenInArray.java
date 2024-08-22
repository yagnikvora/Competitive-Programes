import java.util.Scanner;

public class SumOfOddEvenInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0; i<size ; i++){
            System.out.print("a["+i+"]:");
            a[i] = sc.nextInt();
        }
        sumOddEven(a);
    }

    private static void sumOddEven(int[] a) {
        int oddSum = 0;
        int evenSum = 0;
        for(int i=0 ; i<a.length ; i++){
            if(a[i]%2 == 0)
                evenSum += a[i];
            else
                oddSum += a[i];
        }
        System.out.println("Sum of Odd : "+oddSum+"\nSum of Even : "+evenSum);
    }
}
