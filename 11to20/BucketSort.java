import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BucketSort {
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
        int max = Arrays.stream(a).max().getAsInt();
        ArrayList<Integer> buckets[] = new ArrayList[(max/10)+1];

        for(int i=0; i<buckets.length ; i++){
            buckets[i] = new ArrayList<Integer>();
        }

        for (int k : a) {
            buckets[k / 10].add(k);
        }

        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (Integer integer : bucket) {
                a[index++] = integer;
            }
        }
    }
}
