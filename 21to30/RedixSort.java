import java.util.Arrays;
import java.util.Scanner;

public class RedixSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i = 0;i<a.length;i++){
            System.out.print("a["+i+"]:");
            a[i] = sc.nextInt();
        }
         a = sortArray(a);
        for (int i : a) {
            System.out.print(i + ",");
        }
    }
    public static int[] sortArray(int[] a){
        int max = Arrays.stream(a).max().getAsInt();
        for(int p = 1 ; (max/p) > 0; p = p*10){
            a = count(a,p);
        }
        return a;
    }

    public static int[] count(int[] a,int p){
        int[] c = new int[10];
        int[] b = new int[a.length];
        Arrays.fill(c,0);
        for(int i = 0;i<a.length;i++){
            c[(a[i]/p)%10]++;
        }
        for(int i = 1; i<c.length;i++){
            c[i] += c[i-1];
        }
        for(int i=a.length-1;i>=0;i--){
            b[--c[(a[i]/p)%10]] = a[i];
        }
        return b;
    }
}