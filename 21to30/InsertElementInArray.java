import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int[] a = new int[size+1];
        for(int i = 0;i<size;i++){
            System.out.print("a["+i+"]:");
            a[i]=sc.nextInt();
        }

        System.out.print("Enter position to insert new element : ");
        int pos = sc.nextInt();
        if(pos <= 0 || pos > a.length){
            System.out.println("---Please enter right position---");
            return;
        }
        System.out.print("Enter value to insert : ");
        int val = sc.nextInt();

        insertElement(a,pos,val);

        for (int j : a)
            System.out.print(j + ",");
    }

    public static void insertElement(int a[],int pos,int val){
        for(int i = a.length-1 ; i>=pos ; i--)
            a[i] = a[i-1];
        a[pos-1] = val;
    }
}
