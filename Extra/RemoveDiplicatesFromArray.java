import java.util.Scanner;

public class RemoveDiplicatesFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr Size of Array : ");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i =0; i<size;i++){
            System.out.print("a["+i+"]:");
            a[i] = sc.nextInt();
        }

        int unique[] = new int[size];
        int newSize = uniqueArray(a,unique);
        System.out.print("Original array : ");
        for(int i : a)
            System.out.print(i+",");

        System.out.print("\nWithout Duplicate array : ");
        for(int i=0 ; i<newSize ; i++)
            System.out.print(unique[i]+",");

    }

    private static int uniqueArray(int[] a, int[] unique) {
        int k = 0;
        for(int i = 0 ; i<a.length;i++){
            boolean isDuplicate = false;
            for(int j = 0;j<k;j++){
                if(a[i] == unique[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate)
                unique[k++] = a[i];

        }
        return k;
    }
}
