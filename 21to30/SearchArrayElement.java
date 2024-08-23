import java.util.Scanner;

public class SearchArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int[] a = new int[size+1];
        for(int i = 0;i<size;i++){
            System.out.print("a["+i+"]:");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter element to search : ");
        int m = sc.nextInt();
        int res= isInArray(a,m);
        if(res == 1)
            System.out.println("Element is found in array");
        else
            System.out.println("Element is not found in array");
    }

    private static int isInArray(int[] a, int m) {
        return findElement(a,m,0);
    }

    private static int findElement(int[] a, int m, int i) {
        if(a.length == i)
            return 0;

        if(a[i] == m)
            return 1;

        return findElement(a,m,i+1);
    }
}
