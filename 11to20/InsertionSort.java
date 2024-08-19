import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i = 0;i<a.length;i++){
            System.out.print("a["+i+"]:");
            a[i] = sc.nextInt();
        }
        sortArray(a);
        for (int i : a) {
            System.out.print(i + ",");
        }
    }
    private static void sortArray(int[] a) {
       for(int i = 1 ; i<a.length;i++){
           int j = i-1;
           int temp = a[i];
           while(j>=0 && a[j] > temp){
               a[j+1] = a[j];
               j--;
           }
           a[j+1] = temp;
       }
    }
}
