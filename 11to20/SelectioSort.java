import java.util.Scanner;

public class SelectioSort {
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
        for(int i =0 ; i<a.length-1;i++){
            int min = i;
            for(int j = i+1;j<a.length;j++){
                if(a[min] > a[j]){
                    int temp = a[min];
                    a[min] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
